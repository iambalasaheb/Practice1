package keybord;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keybord3 {
	
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
		driver.get("http://demo.automationtesting.in/Register.html"); 
		//identify first name input field 
		WebElement firstname=driver.findElement(By.cssSelector("[placeholder='First Name']"));
		//type or fill the first name as admin using ctrl-a
		firstname.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));//type admin & select all
		//in first name field use ctrl-c
		firstname.sendKeys(Keys.chord(Keys.CONTROL,"c"));//to copy the content
		//paste coppied content in last name field using cntl-v
		driver.findElement(By.cssSelector("input[placeholder='Last Name']"))
		.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
 }
}
