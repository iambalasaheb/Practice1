package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browseroperation1 {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximize the browser window
		driver.manage().window().maximize();
		//we dont have optin for minimize the window we need to provide the size to window
		driver.manage().window().setSize(new Dimension(450,600));
		//maximize the window
        driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.linkText("Forgot your password?"));
        System.out.println("print current url= "+driver.getCurrentUrl());
        //want to come back to privious page
        driver.navigate().back();
        System.out.println("Login page url: "+driver.getCurrentUrl());
		//want to go back to next page again
		driver.navigate().forward();
		System.out.println("Forgot your password, page url: "+driver.getCurrentUrl());
		//want to refresh /reload the current page
		driver.navigate().refresh();
		//want to move to other url
		driver.navigate().to("https://www.google.com");
        
	}

}
