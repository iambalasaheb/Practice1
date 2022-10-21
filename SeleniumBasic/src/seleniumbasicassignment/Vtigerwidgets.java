package seleniumbasicassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtigerwidgets {

	public static void main(String[] args) {
		//set browser path
				String path=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", path);
				//creating an instance of
				WebDriver driver=new ChromeDriver();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//call the url
				driver.get("https://demo.vtiger.com/vtigercrm/index.php");
				//click on sign in button
				driver.findElement(By.cssSelector(".button.buttonBlue")).click();
				//click on wigdet button
				driver.findElement(By.cssSelector(".btn.btn-default.addButton.dropdown-toggle")).click();
				//select history
				driver.findElement(By.cssSelector("a[data-name='History']")).click();
				//click on widget button
				driver.findElement(By.cssSelector(".btn.btn-default.addButton.dropdown-toggle")).click();
               //click on tag cloud
				driver.findElement(By.cssSelector("a[data-name='TagCloud']")).click();
				//click on widget button
				driver.findElement(By.cssSelector(".btn.btn-default.addButton.dropdown-toggle")).click();
              //click on funnel widget
		      driver.findElement(By.cssSelector("a[data-name='GroupedBySalesStage']")).click();
              //click on user profile and sign out the page
		      driver.findElement(By.cssSelector(".userName")).click();
              driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();				
	}

}
