package seleniumbasicassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssatributevalidation {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//seth the path of driver
		System.setProperty("webdriver.chrome.driver", path);
		//cretae an instance of driver
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximize the window
		driver.manage().window().maximize();
		//get url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement signin=driver.findElement(By.cssSelector("button[type='submit']"));
		
		String fontsize=signin.getCssValue("font-size");
		String color=signin.getCssValue("color");//RGBA format clour code
		String backgroundcolour=signin.getCssValue("background-image");
		System.out.println("fontsize= "+fontsize);
		System.out.println("colour= "+color);
		System.out.println("backgroundcolour= "+backgroundcolour);
		
		String forgotpasswordlinkcolor=driver.findElement(By.cssSelector(".forgotPasswordLink")).getCssValue("color");
        System.out.println("forgotpasswordlinkcolor= "+forgotpasswordlinkcolor);//RGBA format clour code

	}

}
