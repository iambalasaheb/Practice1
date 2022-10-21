package Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crickinfo {

	public static void main(String[] args) {
		//set path to the browser
		   String path=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		   System.setProperty("webdriver.chrome.driver", path);
		   //create an instance of webdriver
		   WebDriver driver=new ChromeDriver();
		   //hit url to get open browser
		//open crickinfo.com
		   driver.get("https://www.espncricinfo.com/");
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		   
		//validate home page using title and url
		 String expectedurl="https://www.espncricinfo.com/";
	    String currenturl=driver.getCurrentUrl();
	    System.out.println("url validation of crickinfo= "+expectedurl.equals(currenturl));
	    String expecttitle="Live cricket scores, match schedules, latest cricket news, cricket videos";
	    String currenttitle=driver.getTitle();
	    System.out.println("title validation of crickinfo= "+expecttitle.equals(currenttitle));
		//get main menu option count
	    List<WebElement> menu=driver.findElements(By.xpath("//div[@class='ds-flex ds-flex-row']/div"));
	    System.out.println("option count of menu= "+menu.size());
		//print main menu options name by using for loop
	    for(int i=0;i<menu.size();i++) {
	    	System.out.println("option shows= "+menu.get(i).getText());
	    	
	    }
	    
	}

}
