package maventest;

import org.openqa.selenium.WebDriver;

import utilities.DateUtility;
import utilities.SeleniumUtility;

public class screenshot {

	public static void main(String[] args) {
		//create an instance of utility
		    SeleniumUtility s=new SeleniumUtility();
		    //calling setup method
		    WebDriver driver=s.setUp("chrome", "https://www.youtube.com/");
          //by using date utility date and time to capture screenshots
		    String date=DateUtility.getRequiredDateBasedOnNumberOfDays("ddMMyyyyHHmmss", 0);
		    //to give location of screenshot folder
			String fileName=".\\src\\test\\resources\\screenshots\\GoogleSearchPage"+date+".png";
			//comand to capture
			s.takeScreenshot(fileName);
	}

}
