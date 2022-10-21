package SamplePageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebPages.VtigerHomePage;
import WebPages.VtigerLeadsPage;
import WebPages.VtigerLoginPage;
import utilities.SeleniumUtility;

public class VtigerLeadPage extends SeleniumUtility {
	VtigerLoginPage getVtigerLoginPage=null;
	VtigerHomePage getVtigerHomePage=null;
	VtigerLeadsPage getVtigerLeadsPage=null;
	
  @BeforeTest
  public void prerequsite() {
	WebDriver driver=setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
	getVtigerLoginPage=new VtigerLoginPage(driver);
	getVtigerHomePage=new VtigerHomePage(driver); 
	getVtigerLeadsPage=new VtigerLeadsPage(driver);
	getVtigerLoginPage.loginInVtiger("admin", "Test@123");
	getVtigerHomePage.navigatedToLeadsPage();
  }
  @Test
  public void testLeadCreation() {
	  getVtigerLeadsPage.newlyCreateLead("Champak", "Jetha", "9876542536");  
	  Assert.assertTrue(getVtigerLeadsPage.checkLeadCreation(), "Leads not created");
	  
  }
  @Test
  public void testLeadDeletion() {
	  getVtigerLeadsPage.deleteCreatedLead();
  }
  
}
