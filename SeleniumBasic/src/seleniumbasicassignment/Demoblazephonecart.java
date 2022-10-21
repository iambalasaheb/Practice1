package seleniumbasicassignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoblazephonecart {

	public static void main(String[] args) {
   //seth path of browser
		String driverpath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverpath);
		//create an instance
		WebDriver driver=new FirefoxDriver();
		//maximize browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to enter required url to open the browser
		driver.get("https://www.demoblaze.com/");
		//by using return type list<WebElements>
		//to find elements name
		List<WebElement> devicename=driver.findElements(By.cssSelector("div#tbodyid h4>a"));
		//to find elements price
		List<WebElement> deviceprice=driver.findElements(By.cssSelector("div#tbodyid h5"));
        //by using for loop print all elements with price
		for(int i=0;i<devicename.size();i++) {
			System.out.println(devicename.get(i).getText()+": "+deviceprice.get(i).getText());
		}	
	
	}

}
