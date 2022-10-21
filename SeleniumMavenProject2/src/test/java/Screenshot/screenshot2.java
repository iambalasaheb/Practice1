package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.DateUtility;
import utilities.SeleniumUtility;

//import utilities.SeleniumUtility;

public class screenshot2 {
	public static void main(String[] args) throws IOException {
		SeleniumUtility s1 = new SeleniumUtility();

		WebDriver driver = s1.setUp("chrome", "https://wwww.facebook.com");
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		
//		File screenShot=ts.getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(screenShot, new File(".\\Screenshots\\GoogleSearchPage.png"));
					//or
		
		String date=DateUtility.getRequiredDateBasedOnNumberOfDays("ddMMyyyyHHmmss", 0);
		String fileName=".\\Screenshots\\facebook"+date+".png";
		s1.takeScreenshot(fileName);
	}

}