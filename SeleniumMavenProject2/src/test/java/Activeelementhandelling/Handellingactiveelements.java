package Activeelementhandelling;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Handellingactiveelements {

	public static void main(String[] args) {
		SeleniumUtility s=new SeleniumUtility();
		// to call setup method by using SeleniumUtility
		WebDriver driver=s.setUp("chrome", "https://demo.actitime.com/");
		//login application without enetering username and password field
		//verify that mouse pointer is on username filed
		WebElement username=driver.switchTo().activeElement();
		String str=username.getAttribute("placeholder");
		//identify and send keys to field and using tab pointer shift to password field
		System.out.println("is mouse pointer present in username input field= "+str.equals("Username"));
		username.sendKeys("admin",Keys.TAB);
		//fill the password field and enter to login
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
		
	}

}
