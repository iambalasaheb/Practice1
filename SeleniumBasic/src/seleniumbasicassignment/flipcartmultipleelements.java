package seleniumbasicassignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartmultipleelements {

	public static void main(String[] args) {
//set the path of browser
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath );
		//create an generic instance
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to enter required url
		driver.get("https://www.flipkart.com/");
		//validation of home page by using homepage title
		String currenttitle=driver.getTitle();
		String requiredtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		System.out.println(currenttitle.equals(requiredtitle));
		//to get main mainu option count with text
		List<WebElement> mainmenu=driver.findElements(By.cssSelector(".xtXmba"));
		System.out.println("unit count= "+mainmenu.size());
		//using for each loop
		for(int i=0;i<mainmenu.size();i++) {
			System.out.println(mainmenu.get(i).getText());
			//close the browser
			driver.close();
		}
		
		
	}

}
