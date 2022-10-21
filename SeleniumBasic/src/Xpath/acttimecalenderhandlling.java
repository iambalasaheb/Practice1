package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class acttimecalenderhandlling {

	public static void main(String[] args) throws InterruptedException {
		//set path to the browser
		   String path=System.getProperty("user.dir")+"\\Executables\\chromedriver1.exe";
		   System.setProperty("webdriver.chrome.driver", path);
		   //create an instance of webdriver
		   WebDriver driver=new ChromeDriver();
		   //hit url to get open browser
		   driver.get("https://demo.actitime.com");
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 //login with valid username and password
		   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		   driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		   driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		   Thread.sleep(2000);
		   //click on task tab
		   driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		   //click on add new button and select new task
		   driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
		   //click on new task
		   driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
		   //select project
		driver.findElement(By.xpath("//tr[@class='selectCustomerRow']//div[@class='dropdownButton']")).click();   
		   driver.findElement(By.xpath("//div[@class='itemRow cpItemRow selected']")).click();
		   driver.findElement(By.xpath("//div[@class=\"inputPlaceholder\"]/input[@type='text']")).click();
		   driver.findElement(By.xpath("//div[5][text()='Android testing']")).click();
//		   driver.findElement(By.xpath("//div[@class='searchItemList']/div[5][text()='Android testing']")).click();
//		//entre task name as testing
		   
		 
//		   //select customer
//		   driver.findElement(By.xpath("//div[@class='comboboxButton disabled']/div[3][@class='dropdownButton']")).click();
		   //select deadline date from next month
		 //work type as testing
		   //click on create task button
		   //verify that new task is created or not
		   //select newly created task checkbox
		 //click on delete link
		   //confirm delation
		   //verify newly created task is delated or not
		 
	}

}
