package SamplePageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebPages.VtigerContactCreation;
import WebPages.VtigerHomePage;
import WebPages.VtigerLoginPage;
import utilities.SeleniumUtility;

public class testContactPage extends SeleniumUtility {
	VtigerLoginPage getVtigerLoginPage=null;
	VtigerHomePage getVtigerHomePage=null;
	VtigerContactCreation getVtigerContactCreation=null;
	
  @BeforeTest
  public void prerequisite() {
	  WebDriver driver=setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
	  getVtigerLoginPage=new VtigerLoginPage(driver);
	  getVtigerHomePage=new VtigerHomePage(driver);
	  getVtigerContactCreation=new VtigerContactCreation(driver);
	  getVtigerLoginPage.loginInVtiger("admin", "Test@123"); 
	 
  }
  
  @Test
  public void testContactDeletion() {
	  getVtigerContactCreation.deleteCreatedContact(); 
  }
  
  @Test
  public void testContactCreation() {
	  getVtigerContactCreation.contactCreation("Balasaheb", "Supekar");
	  Assert.assertTrue(getVtigerContactCreation.checkContactCreation(),"contact is not created");
  }
}
