package Scrrenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		//set path to the browser
		   String path=System.getProperty("user.dir")+"\\Executables\\chromedriver1.exe";
		   System.setProperty("webdriver.chrome.driver", path);
		   //create an instance of webdriver
		   WebDriver driver=new ChromeDriver();
		   //maximize the window
		   driver.manage().window().maximize();
		   //applay implicit wait
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   //hit url to get open browser
		   driver.get("https://www.google.com");
		   //to create object of screenshot  
		   TakesScreenshot ts=(TakesScreenshot)driver;
			
			File screenShot=ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenShot, new File(".\\Screenshot\\GoogleSearchPage.png"));
	}

}
