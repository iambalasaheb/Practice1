package seleniumbasicassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbuscalenderhandelling {

	public static void main(String[] args) throws InterruptedException {
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
		driver.get("https://www.redbus.in/");
		//select option from pune
		WebElement ref=driver.findElement(By.id("src"));
		ref.click();
		ref.sendKeys("Pune");
		WebElement ref1=driver.findElement(By.id("dest"));
		ref1.click();
		ref1.sendKeys("Goa");
		//date in future
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#onward_cal")).click();
		driver.findElement(By.cssSelector("html>body>#rb-calendar_onward_cal>table>tbody>tr:nth-of-type(4)>td[class='current day']")).click();
		//click on serch button
		Thread.sleep(3000);
		driver.findElement(By.id("search_btn")).click();
		//departure time should be after 6 pm
		driver.findElement(By.cssSelector("li:nth-of-type(4)>label[class='custom-checkbox']")).click();
		//bus type AC
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("li>label[class='custom-checkbox']")).click();
		//Get the bus name 
		Thread.sleep(3000);
		WebElement ref3=driver.findElement(By.cssSelector("div[class='travels lh-24 f-bold d-color']"));
		System.out.println("name of bus= "+ref3.getText());
         //get thet bus price
		WebElement ref4=driver.findElement(By.cssSelector("div>span[class='f-19 f-bold']"));
		System.out.println("name of bus= "+ref4.getText());

	}

}
