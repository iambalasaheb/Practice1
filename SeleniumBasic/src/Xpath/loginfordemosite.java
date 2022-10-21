package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginfordemosite {

	public static void main(String[] args) {
		//get path to the drive
 String path=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
 System.setProperty("webdriver.gecko.driver", path);
 //create an instance of driver with upcasting
 WebDriver driver=new FirefoxDriver();
 //put url to open browser
 driver.get("https://demosite.executeautomation.com/Login.html");
 //get page title name and length
 //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 System.out.println("page title name= "+driver.getTitle().length());
 System.out.println("page title name= "+driver.getTitle());
 //get the url and varify thet page url correct or not
 String expectedurl="https://demosite.executeautomation.com/Login.html"; 
 System.out.println("validation of url= "+expectedurl.equals(driver.getCurrentUrl()));
 //entre uusername as execution
 driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("execution");
 //enter password as admin
 driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin");
 //hit on login
 driver.findElement(By.xpath("//input[@name='Login']")).click();
 //get the page title and current url and print it on consloe
 String expectedtitle="Execute Automation";
 System.out.println("printing title= "+driver.getTitle());
 System.out.println("print url= "+driver.getCurrentUrl());
 //click on logout
 driver.findElement(By.xpath("//span[text()='Logout']")).click();
 //close the browser
 driver.close();
	}

}
