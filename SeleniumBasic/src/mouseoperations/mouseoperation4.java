package mouseoperations;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoperation4 {

	public static void main(String[] args) {
		String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.facebook.com/");
		//to create an instance of current class
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		//inspect and type admin in first name field
		WebElement usernameinput=driver.findElement(By.xpath("//input[@name='firstname']"));
		usernameinput.sendKeys("admin");
		//copy the text of first name field
		usernameinput.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		//or
		//act.doubleClick(usernameinput).perform();
		usernameinput.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		//paste of copied text in lastname option
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
	}

}
