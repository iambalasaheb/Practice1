package Activeelementhandelling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class HandellingAlertPopup {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		//calling setup method by creating instance of WebDriver
		WebDriver driver=s1.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		//as required element present in frame we need to switch our control inside the frame
		driver.switchTo().frame("iframeResult");
		//inspect the element tryit
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//get the alert text massage
		System.out.println("alert text msg= "+driver.switchTo().alert().getText());
		//to perform another action on alert we need to switch our control to the alert
		driver.switchTo().alert().accept();
		/**
		In order handle any JavaScirpt Pop-up we need use driver.switchTo().alert()
		because java script popup doesn't contain HTML code
		we use predefined functions of Alert to perform any operation on it
		after every action control comes back to the main page


		*/

	}

}
