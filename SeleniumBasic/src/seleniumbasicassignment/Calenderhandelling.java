package seleniumbasicassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderhandelling {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//seth the path of driver
		System.setProperty("webdriver.chrome.driver", path);
		//cretae an instance of driver
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximize the window
		//driver.manage().window().maximize();
		//get url
		driver.get("https://www.makemytrip.com/");
		//close login popup
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		//identify departure date and click on it
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		//select any date from next month
		driver.findElement(By.cssSelector("div.DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")).click();
		
	}

}
