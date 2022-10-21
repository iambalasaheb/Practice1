package seleniumbasicassignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesuggestions {

	public static void main(String[] args) throws InterruptedException {
		String p=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", p);
		//create an instance of browser and upcasting it to WebDriver
		WebDriver driver=new ChromeDriver();
		//maximize the browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to enter required application url use get of webdriver interface
		driver.get("https://www.google.com/");
		//type selenium interview questions
		driver.findElement(By.name("q")).sendKeys("selenium interview questions");
		//explicit wait
		Thread.sleep(3000);
		//get all the suggetions
		List<WebElement> suggestions=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));
		//suggetion counts
		System.out.println("count of suggetions= "+suggestions.size());
		//print suggestions in the consloe
		for(int i=0;i<suggestions.size();i++) {
			System.out.println(suggestions.get(i).getText());
			/* or
			 * WebElement element=sugg.get(i);
			System.out.println(element.getText());
			 */
		}
		
	}

}
