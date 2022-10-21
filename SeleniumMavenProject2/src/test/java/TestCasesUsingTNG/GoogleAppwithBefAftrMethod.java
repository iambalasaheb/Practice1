package TestCasesUsingTNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class GoogleAppwithBefAftrMethod extends SeleniumUtility {
	//import selenium utility
	SeleniumUtility s=new SeleniumUtility();
	//instance of wbdriver
	WebDriver driver;
	
  @BeforeMethod
  public void StartUp() {
	  driver = setUp("chrome", "https://www.google.com/");
  }
     @Test
     public void testgooglelandingpage() {
    	String Expectedtitle="Google";
    	String Actualtitle=driver.getTitle();
    	AssertJUnit.assertEquals(Actualtitle, Expectedtitle,"Google Search page not opened or its title got changed");    	
     }
@Test
public void testsearch() {
	getActiveElement().sendKeys("SQL",Keys.ENTER);
	Assert.assertTrue(getPageTitle().contains("SQL"), "SQL serch is faild");	
}
@AfterMethod
public void cleanUp() {
	tearDown();
}

}

