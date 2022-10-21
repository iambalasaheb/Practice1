package seleniumbasicassignment;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Custumdropdown {

	public static void main(String[] args) {
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
driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
WebDriverWait wait=new WebDriverWait(driver,20);
//identify dropdown list
WebElement dropdown=driver.findElement(By.id("bsd1-button"));
wait.until(ExpectedConditions.elementToBeClickable(dropdown));
//identify dropdown list and click on it
dropdown.click();
//identify all the options and store them into list<webelement>
List<WebElement> options=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
//use size to get option count
System.out.println("size count= "+options.size());
//by using for loop to print one by one options
for(int i=0;i<options.size();i++) {
	System.out.println(options.get(i).getText());
}
options.get(3).click();

	}

}
