package Explicitewait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait1 {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//explicite wait (dynamic wait)
		WebDriverWait wait=new WebDriverWait(driver,20);
		//identify username and password perform required operation
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		//identify password
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		//click on login button
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		//wait for logout link to be loaded in the page
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		System.out.println("Home page title= "+driver.getTitle());
		//add condition to wait using webdriverwait instance
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		//click on logout link
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		//close the browser
		//driver.close();
		
		
	}

}
