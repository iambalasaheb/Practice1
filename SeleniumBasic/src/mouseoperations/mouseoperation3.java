package mouseoperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoperation3 {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		// frame handling
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		//create an instance of action class by passing required browser instsnce to its constructor
		Actions action=new Actions(driver);
		
		List<WebElement> sourceelements=driver.findElements(By.xpath("//ul[@id='gallery']/li"));
		WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));
		
		//drag one by one element into trash
//		action.dragAndDrop(sourceelements.get(0), target).build().perform();
//		Thread.sleep(2000);
//		action.dragAndDrop(sourceelements.get(1), target).build().perform();
//		Thread.sleep(2000);
//		action.dragAndDrop(sourceelements.get(2), target).build().perform();
		draganddrop(action,sourceelements.get(0),target);
	}
    static void draganddrop(Actions action,WebElement src,WebElement target) {
	     action.dragAndDrop(src, target).build().perform();
    }
   }
