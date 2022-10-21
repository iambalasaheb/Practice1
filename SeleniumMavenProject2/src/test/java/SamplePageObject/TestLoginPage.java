package SamplePageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import WebPages.VtigerLoginPage;
import utilities.SeleniumUtility;

public class TestLoginPage extends SeleniumUtility {
	
  @Test
  public void testVtigerLogin() {
	  /*step1=open chrome browser and enter url
	   */
	  WebDriver driver=setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
	  VtigerLoginPage getVtigerLoginPage=new VtigerLoginPage(driver);
	  //log in with valid credentials
	  getVtigerLoginPage.loginInVtiger("admin", "Test@123");
	  //validation of vtiger homepage open or not by using assertion
	  Assert.assertEquals(getCurrentTitleOfApplication(), "Dashboard");
	  //close the browser
	  cleanUp();
  }
}
