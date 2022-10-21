package CalenderHandelling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {

	public static void main(String[] args) throws InterruptedException {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver1.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//open url
		driver.get("https://www.redbus.in/");
		//select from pune to goa
		WebElement from=driver.findElement(By.xpath("//input[@id='src']"));
		from.click();
		from.sendKeys("Swargate,Pune");
		WebElement to=driver.findElement(By.xpath("//input[@id='dest']"));
		to.click();
		to.sendKeys("Mapusa,Goa");
		//select date in future
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[5]/td[4]")).click();
		Thread.sleep(2000);
		//click on search button
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		//departure time will be after 6 pm
	driver.findElement(By.xpath("//li/label[@title='After 6 pm']")).click();
//		//bus type ac
		driver.findElement(By.xpath("//label[1][@for='bt_AC']")).click();
		//get the bus name along with its price
		//close the browser
		driver.close();
	}

}
