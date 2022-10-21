package seleniumbasicassignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opencrickinfo {

	public static void main(String[] args) {
		//set the path of browser
				String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver",driverpath );
				//create an generic instance
				WebDriver driver=new ChromeDriver();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//to enter required url
				driver.get("https://www.espncricinfo.com/");
				//validate of homepage opencrick info by using url
				String requiredurl="https://www.espncricinfo.com/";
				String currenturl=driver.getCurrentUrl();
				System.out.println("validation result= "+requiredurl.equals(currenturl));
				//to get main menue option count
				List<WebElement> mainmenue=driver.findElements(By.cssSelector(".ds-popper-wrapper"));
			//print the number of count
				System.out.println("no of count= "+mainmenue.size());
				//use for loop for printing
				for(int i=0;i<mainmenue.size();i++) {
					System.out.println(mainmenue.get(i).getText());
					
				}
	}

}
