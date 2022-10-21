package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class Vtiger {

	public static void main(String[] args) throws InterruptedException {
		/*widgets add and delete,go to marketing,to project,create contact,delete contact,on leads,create
		 * lead,delete lead,back to compaigen,all functions operations create,and delete perform 
		 * (8 test cases) 
		 */
    //create an object of selenium utility
		SeleniumUtility s=new SeleniumUtility();
	//to launch the browser using setup method
	WebDriver driver=s.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	//script for login vtiger has allready shows username and pass so we r going to click login button directly
	driver.findElement(By.xpath("//button[@class='button buttonBlue']")).click();
	//click on add wighet,add wiget,delete the wigdet,accept popup,
	driver.findElement(By.xpath("//button[@class='btn btn-default addButton dropdown-toggle']")).click();
	driver.findElement(By.xpath("//a[@data-name='History']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//i[@class='fa fa-remove']")).click();
	driver.findElement(By.xpath("//button[text()='Yes']")).click();
	/*go to the dashbord,marketing,contact,createcontact, 1 st name,last name, save,
	 *  delete contact,accept deletion popup,
	 */
	driver.findElement(By.xpath("//span[@class='app-icon fa fa-bars']")).click();
	driver.findElement(By.id("MARKETING_modules_dropdownMenu")).click();
	driver.findElement(By.xpath("//a[@title='Contacts']/span[2]")).click();
	driver.findElement(By.xpath("//button[@id='Contacts_listView_basicAction_LBL_ADD_RECORD']")).click();
	driver.findElement(By.xpath("//input[@id='Contacts_editView_fieldName_firstname']")).sendKeys("Balasaheb");
	driver.findElement(By.xpath("//input[@id='Contacts_editView_fieldName_lastname']")).sendKeys("Supekar");
	driver.findElement(By.xpath("//button[@class='btn btn-success saveButton']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']")).click();
	driver.findElement(By.xpath("//li[@id='Contacts_detailView_moreAction_Delete_Contact']/a")).click();
	driver.findElement(By.xpath("//div[@class='modal-footer']/button[2]")).click();
	/*create lead=click on dashboard,click on marketing,click on leads,add new leads,add first name,
	 * last name,click on save,click on more,click on delete,clik yes on confirmation popup
	 * 
	 */
	driver.findElement(By.xpath("//span[@class='app-icon fa fa-bars']")).click();
	driver.findElement(By.id("MARKETING_modules_dropdownMenu")).click();
	driver.findElement(By.xpath("//span[text()=' Leads']")).click();
	driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();
	driver.findElement(By.id("Leads_editView_fieldName_firstname")).sendKeys("Virat");
	driver.findElement(By.id("Leads_editView_fieldName_lastname")).sendKeys("Kohli");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']")).click();
	driver.findElement(By.id("Leads_detailView_moreAction_Delete_Lead")).click();
	driver.findElement(By.xpath("//button[@class='btn confirm-box-ok confirm-box-btn-pad btn-primary']")).click();
	/*
	 * 
	 */

	System.out.println("operations perform");
	
	}

}
