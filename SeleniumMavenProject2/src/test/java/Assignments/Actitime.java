package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.SeleniumUtility;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		//by using utitlity import utitlity class
		SeleniumUtility s1=new SeleniumUtility();
		//by calling created method to open the url
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com");
		//enter id and pass
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//create new task click on tasks
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		//click on add new
		driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
		//click on new task
		driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
		//inspect placeholder tab
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[1][@class='comboboxButton']")).click();
		//select type of customer
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='searchItemList']//div[4]")).click();
		//select project
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[@class='comboboxButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@style='display: block; top: 30px; left: 0px;']//div[@class='searchItemList']/div[5]")).click();
		//enter task name
		driver.findElement(By.xpath("//tr/td/input[@Placeholder='Enter task name']")).sendKeys("Testing");
		//click on checkbox
		driver.findElement(By.xpath("//div/label/span[@class='checkmark checkMark']")).click();
		//click on create task
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='basicLightboxFooter']//div[@class='components_button_label']")).click();
        //click on created task check box for deletion purpose
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[@class='taskRow noLastTrackingDate']//div[@class='img']")).click();
		//deleting the task 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='delete button']")).click();
		//delete permenantely
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
	}

}
