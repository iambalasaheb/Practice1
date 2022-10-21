package SamplePageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import WebPages.LoginForOrangeHrm;
import utilities.SeleniumUtility;

public class LoginForHRM extends SeleniumUtility {
	
	
  @Test
  public void testHRMLogin() {
	  //open chrome browser and hit url
	  WebDriver driver=setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  //create an object of pageobject class and pass driver
	  LoginForOrangeHrm getOrangeLogin=new LoginForOrangeHrm(driver);
	  //calling the method of pageobject class and pass string parameter
	  getOrangeLogin.orangeHrmLogin("Admin", "admin123");
	  //validation of orange hrm homepage ist open or not
	  Assert.assertEquals(getCurrentTitleOfApplication(), "OrangeHRM");
	  //close the browser
	  cleanUp();
  }
}
