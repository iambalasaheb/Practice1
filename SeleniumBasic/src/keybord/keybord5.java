package keybord;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keybord5 {

	public static void main(String[] args) throws InterruptedException {
		 //setting path for driver executables
		String path=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//creating instance of brawser and upcating to webDriver
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//apply implicite wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to get web driver interface enter required application url
		driver.get("https://www.flipkart.com/");
		//using escape keyword to avoid login popup
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
		/**
		 * possible ways to refresh the browser:
		 * 1. driver.navigate().refresh();
		 * 2. sendKeys(Keys.F5)
		 * 3. by hitting same URL again
		 * 4. ctrl+R
		 */
		//using navigate.refresh
		driver.navigate().refresh();
		Thread.sleep(2000);
		//by using keys.f5
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
		Thread.sleep(2000);
		//by hitting same url again
   driver.get("https://www.flipkart.com/");		
	Thread.sleep(2000);
//by using ctrl-r
driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,"R");
	}

}
