package Activeelementhandelling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class HandellingConfirmationPopup {

	public static void main(String[] args) {
		// import seleniumutility
		SeleniumUtility s1=new SeleniumUtility();
		//call the setup method
		WebDriver driver=s1.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//required element is present inside the frame we need to shift control to the frame
		driver.switchTo().frame("iframeResult");
		//after confirm framing inspect the element
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//printing the alert text masg
		System.out.println("get the alert text msge:"+driver.switchTo().alert().getText());
		//to perform another action on alert we need to get control on alert
		driver.switchTo().alert().dismiss();

	}

}
