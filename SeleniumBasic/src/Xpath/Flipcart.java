package Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) {
		//set path to the browser
		   String path=System.getProperty("user.dir")+"\\Executables\\chromedriver1.exe";
		   System.setProperty("webdriver.chrome.driver", path);
		   //create an instance of webdriver
		   WebDriver driver=new ChromeDriver();
		   //hit url to get open browser
		   driver.get("https://www.flipkart.com/");
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   //validate home page by using url
		   String expectedurl="https://www.flipkart.com/";
		  String currenturl=driver.getCurrentUrl();
		   System.out.println("url validation= "+currenturl.equals(expectedurl));		   
		   //get main menu option count
		List<WebElement> menu= driver.findElements(By.xpath("//div[@class='xtXmba']"));
		   System.out.println("main menu option count= "+menu.size());
		   //print main menu option count
		   System.out.println("print main menu option count= "+menu.size());
		   //using for loop print all main menu option
//		   for(int i=0;i<menu.size();i++) {
//			   System.out.println("all elements= "+menu.get(i).getText());			   
//		   }
		   //using for each loop
		   for(WebElement a:menu) {
			   System.out.println("printing options= "+a.getText());
		   }
		   //close the driver
		   driver.close();
	}

}
