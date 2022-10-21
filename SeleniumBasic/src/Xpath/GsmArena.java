package Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena {

	public static void main(String[] args) {
		String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		//open GSMArena.com
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		//validate home page by using url
		String expectedurl="https://www.gsmarena.com/samsung-phones-9.php";
		System.out.println("url validation= "+expectedurl.equals(driver.getCurrentUrl()));
		String expectedtitle="All Samsung phones";
		System.out.println("title validation= "+expectedtitle.equals(driver.getTitle()));
		//get mobile phone name count from phone finder 
		List<WebElement> phone=driver.findElements(By.xpath("//div[@id='body']/aside/div/ul/li"));
		System.out.println("phone count= "+phone.size());
		//print mobile phone names using for each loop
		for(WebElement a:phone) {
			System.out.println("names of phones= "+a.getText());
		}
	
		
	}

}
