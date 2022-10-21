package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class Orangehrm {

	public static void main(String[] args) {
   SeleniumUtility s=new SeleniumUtility();
   //test case1=login
   WebDriver driver=s.setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
   driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
   //test case=2 create new pim page
   //click on pim page
   driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
   //click on new button
   driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
   //enter fisrt name,last name,employe id,click on save
   driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("John");
   driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Biden");
   driver.findElement(By.xpath("//div[2]/input[@class='oxd-input oxd-input--active']")).sendKeys("12345");
   driver.findElement(By.xpath("//button[@type='submit']")).click();
   //open employee list
   driver.findElement(By.xpath("//a[text()='Employee List']")).click();
   //test case=3&4 edit and delete the task
   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[21]/div/div[1]/div/div/label/span/i")).click();
   //select check box for delation
   driver.findElement(By.xpath("//div[33]//input[@type='checkbox']")).click();
   //click on delete button
   driver.findElement(By.xpath("//div[@class='orangehrm-modal-footer']/button[2]")).click();
   
   
	}

}
