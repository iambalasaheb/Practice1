package SamplePageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebPages.ActitimeLoginPage;
import WebPages.ActtimerReportCreate;
import utilities.SeleniumUtility;

public class ActitimeReportCreation extends SeleniumUtility {
	ActitimeLoginPage ref;
	ActtimerReportCreate ref1;
	
  @BeforeTest
  public void prerequisite() {
	  //call setup method
	  WebDriver driver=setUp("chrome","https://demo.actitime.com");
	  //calling login script class method with the help of referance
	  ref=new ActitimeLoginPage(driver);
	  //calling report creation class method with referance 
	  ref1=new ActtimerReportCreate(driver);
	  ref.loginInActitime("admin", "manager");
	  
  }
  @Test
  public void actitimeReportMethod() {
	  ref1.reportCreateActitime();
	  Reporter.log("workdone successfully");
	  cleanUp();
  }
}
