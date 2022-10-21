package keybord;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keybord2 {

	public static void main(String[] args) {
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
				driver.get("https://demo.actitime.com/login.do");
				//login in actitime application by using enter key
				driver.findElement(By.cssSelector("#username")).sendKeys("admin",Keys.TAB);
				driver.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager",Keys.ENTER);
	}

}
