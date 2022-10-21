package mouseoperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoperation2 {

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
		driver.get("https://www.globalsqa.com/demo-site/");
		// identify all the elements of main menu
		List<WebElement> mainMenu=driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		System.out.println("option count of main menu= "+mainMenu.size());
		//create an instance of actions class by passing required browser instance to its constructor
		Actions act=new Actions(driver);
		//to do hover over the home option
		 act.moveToElement(mainMenu.get(0)).perform();
     for(int i=0;i<mainMenu.size();i++) {
	   WebElement option=mainMenu.get(i);
	   act.moveToElement(option).perform();
	   Thread.sleep(2000);	
      }
		 mouseHoverOverTheElement(act, mainMenu.get(2));
         mouseHover(act, mainMenu);
  		 act.moveToElement(mainMenu.get(1), 100, 0).perform();
  		 mouseHoverWithCords(act, mainMenu.get(1),100,0);
		rightClick(act, mainMenu.get(1));

	}
   static void mouseHoverOverTheElement(Actions act,WebElement element) {
	act.moveToElement(element).perform();
}
	static void rightClick(Actions act,WebElement option) {
		System.out.println("option name is= "+option.getText());
		act.moveToElement(option).contextClick().build().perform();
		//act.contextClick().build().perform();		
	}
		static void mouseHoverWithCords(Actions act,WebElement option,int X,int Y) {
			System.out.println("option name is= "+option.getText());
			act.moveToElement(option, X, Y).perform();			
		}
		static void mouseHover(Actions act,List<WebElement> mainMenu ) throws InterruptedException {
			for(int i=0;i<mainMenu.size();i++) {
				WebElement option=mainMenu.get(i);
				act.moveToElement(option).perform();
				Thread.sleep(2000);
				
				
			}
		}
	}


