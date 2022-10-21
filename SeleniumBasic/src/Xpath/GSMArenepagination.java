package Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSMArenepagination {

	public static void main(String[] args) throws InterruptedException {
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
		//click on realme phone link present in phone finder
		driver.findElement(By.xpath("//a[text()='Realme']")).click();
		//check whether page has pagination or not //div[@class='nav-pages']
		List<WebElement> page=driver.findElements(By.xpath("//div[@class='nav-pages']"));
		if(page.size()>0) {
			System.out.println("pagination is exists");
		}else {
			System.out.println("pagination does not exist");		
		}
		//if yes then print pagination links names
		for(int i=0;i<page.size();i++) {
			System.out.println(page.get(i).getText());
		}
		System.out.println("print url= "+driver.getCurrentUrl());
		//navigate to each page and get the page url
	for(int i=0;i<page.size();i++) {
		page.get(i).click();
		Thread.sleep(3000);
		System.out.println("print url= "+driver.getCurrentUrl());
		//to avoid stale element exception identify the pagination links
	   page=driver.findElements(By.xpath("//div[@class='nav-pages']"));
	}
	driver.close();
	}

}
