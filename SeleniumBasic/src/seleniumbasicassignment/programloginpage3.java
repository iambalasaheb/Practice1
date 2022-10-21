package seleniumbasicassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class programloginpage3 {

	public static void main(String[] args) throws InterruptedException {
		//set the path of the browser
				String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", driverpath);
				//to create an instance of
				WebDriver driver=new ChromeDriver();
				//to launch the browser get url
				driver.get("https://demo.vtiger.com/vtigercrm/index.php");
				//to provide implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//verify login page by using title validation
				String currenttitle=driver.getTitle();
				String expectedtitle="vtiger";
				System.out.println("verify login page title validation= "+currenttitle.equals("expectedtitle"));
				//enter usernsme and password button and click on login button
				WebElement ref=driver.findElement(By.id("username"));
				ref.clear();
				ref.sendKeys("admin");
				//enter password
				WebElement ref1=driver.findElement(By.id("password"));
				ref1.clear();
				ref1.sendKeys("Test@123");
				//sign in button
				WebElement ref2=driver.findElement(By.className("buttonBlue"));
				ref2.click();
                //validate home page by using url
				String currenturl=driver.getCurrentUrl();
				System.out.println("validation of home page by url= "+currenturl.equals("https://demo.vtiger.com/vtigercrm/index.php"));
				//click on add widget and select any one
				Thread.sleep(2000);
				// click on Widget button
				driver.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();
				// select History
				driver.findElement(By.cssSelector("a[data-name='History']")).click();
				// click on Widget button
				driver.findElement(By.cssSelector(".addButton")).click();
				// select History
				driver.findElement(By.cssSelector("a[data-name='TotalRevenuePerSalesPerson']")).click();
				// click on Widget button
				driver.findElement(By.cssSelector(".addButton")).click();
				// select History
				driver.findElement(By.cssSelector("a[data-name='TopPotentials']")).click();				
				//click on user profile
				driver.findElement(By.cssSelector(".userName")).click();
				driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
                System.out.println("program end");
           driver.close();
	}

}
