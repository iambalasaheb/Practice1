package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class techlistmenuvalidation {

	public static void main(String[] args) throws InterruptedException {
		//get path to the drive
		 String path=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path);
		 //create an instance of driver with upcasting
		 WebDriver driver=new ChromeDriver();
		 //put url to open browser
		 driver.get("https://www.techlistic.com/");		
		//maximize size of the browser
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//click on java link and validate page title
		 driver.findElement(By.xpath("//nav//ul/li[1]/a[text()='Java']")).click();
		 System.out.println("page title validation1= "+driver.getTitle());
		 Thread.sleep(2000);
		//navigate back to the home page
		 driver.navigate().back();
		//click on selenium link and validate page title
		 driver.findElement(By.xpath("//ul/li[2]/div/a[@class='dropbtn']")).click();
		 Thread.sleep(2000);
		 String title2=driver.getTitle();
		 System.out.println("title validation2= "+title2);
		//navigate back to the home page
		 driver.navigate().back();
		//click on DOB link and validae page title
		 driver.findElement(By.xpath("//li[7]/div/a[@class='dropbtn']")).click();
		 Thread.sleep(2000);
		 System.out.println("title validation3= "+driver.getTitle());
		//navigate back to the home page
		 Thread.sleep(2000);
		 driver.navigate().back();
		//click on testng link and validate page title
		 driver.findElement(By.xpath("//li[9]/div/a[@class='dropbtn']")).click();
		 Thread.sleep(2000);
		 System.out.println("title validation4= "+driver.getTitle());
		//close the browser
		 driver.close();

	}

}
