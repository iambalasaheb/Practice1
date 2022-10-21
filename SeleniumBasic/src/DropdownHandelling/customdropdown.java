package DropdownHandelling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class customdropdown {

	public static void main(String[] args) {
		//seth the path of currrent working directory
		   String path=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		   System.setProperty("webdriver.chrome.driver", path);
		   //creating an instance of chromedriver and upcateing to webdriver
		   WebDriver driver=new ChromeDriver();
		   //maximize the browser
		   driver.manage().window().maximize();
		   //implicit wait
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   //open required url
		   driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		   WebDriverWait wait=new WebDriverWait(driver,20);
		   //identify the element
		   WebElement element=driver.findElement(By.xpath("//button[@id='bsd1-button']"));
		   //using wait by 
		   wait.until(ExpectedConditions.elementToBeClickable(element));
		   //identify dropdown list and click on it
		   element.click();
		   //identify all the options and stored them into List<WebElement>
		   List<WebElement> options=driver.findElements(By.xpath("//div[@class='dropdown-menu dropdown-menu-right show']/div/a"));
		   //print option counts
		   System.out.println("option counts= "+options.size());
		   //to print all the options using for loop
		   for(int i=0;i<options.size();i++) {
			   System.out.println(i+":"+options.get(i).getText());			   
		   }
		   //to print perticular option from dropdown
		  System.out.println("to print index no 4= "+options.get(3).getText()); 
		  options.get(1).click();	
	}

}
