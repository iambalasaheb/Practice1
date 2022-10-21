package SamplePageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import WebPages.ActitimeLoginPage;
import utilities.SeleniumUtility;

public class Actitimelogin extends SeleniumUtility {
	
	
  @Test
  public void testActitimelogin() {
	 WebDriver driver=setUp("chrome","https://demo.actitime.com"); 
	 //creting an object of webpage class and pass driver to its constructor
	 ActitimeLoginPage ref=new ActitimeLoginPage(driver);
	 //calling page method with the help of ref of class
	 ref.loginInActitime("admin", "manager");
	 //validation of home page of site by using assertion
	 Assert.assertEquals(getCurrentTitleOfApplication(), "actiTIME - Login");
	  //close the browser
	
  }
}
