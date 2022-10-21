package TestCasesUsingTNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class TestNGwebScript {
	
  @Test
  public void TestCase1() {
	  //by using Utility
	  SeleniumUtility s=new SeleniumUtility();
	  //execuable path using setup method
	  WebDriver driver=s.setUp("chrome", "https://www.ecatering.irctc.co.in/");
	  //title validation
	  String Expectedtitle="Home | eCatering IRCTC: Order Food on Train Online, Food and Meal on Train, Tasty Food for Train Journey";
	  String Actualtitle=driver.getTitle();
	//below code won't fail your Test case even if validation is failed
//		if(actualTitle.equals(expectedTitle)) {
//			System.out.println("TC passed");
//		}else {
//			System.out.println("TC failed");
//		}		
		//if validation is failed dn the test case will be marked as failed
	  AssertJUnit.assertEquals(Actualtitle, Expectedtitle,"eCatering validation got failed");
	  //find the locator for serach tarain
	  WebElement searchtrain=driver.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']"));
	  Assert.assertTrue(searchtrain.isDisplayed(), "Train search input filed is not visible");
	  //close the browser
	  s.tearDown();
	  
	  
  }
}
