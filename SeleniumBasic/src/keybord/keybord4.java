package keybord;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keybord4 {

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
				//using ESCAPE of keyword to avoid login popup
		       WebElement ref=driver.findElement(By.xpath("//body"));
		       ref.sendKeys(Keys.ESCAPE);
				//scrolling using page down button using for loop
		       for(int i=0;i<12;i++) {
		       ref.sendKeys(Keys.PAGE_DOWN);
				Thread.sleep(2000);
		       }
				Thread.sleep(2000);
		//directly goes to the last page
			ref.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
			Thread.sleep(2000);
			//coming back to home page
			ref.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
			
			
				
	}

}
