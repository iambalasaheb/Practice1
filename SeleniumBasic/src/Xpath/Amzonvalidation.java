package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzonvalidation {

	public static void main(String[] args) {
		//set path to the browser
		   String path=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		   System.setProperty("webdriver.chrome.driver", path);
		   //create an instance of webdriver
		   WebDriver driver=new ChromeDriver();
		   //hit url to get open browser
		   driver.get("https://www.amazon.in/");
		   //maximize the browser window
		   driver.manage().window().maximize();
		   //get the page title and print it
		   System.out.println("page title is= "+driver.getTitle()); 
		   //click on the first link says amazon pay
		   driver.findElement(By.xpath("//a[text()='Amazon Pay']")).click();
		   //get the page title and print it
		   String title1=driver.getTitle();
		   System.out.println("page title is= "+title1); 
		   //navigate back to home page
		   driver.navigate().back();
		   //get the page title and print it verify thet title macth to privious one
		   String title2=driver.getTitle();
		   System.out.println("title2= "+title2);
		   System.out.println("compare privious and new title= "+title1.equals(title2));
		   //close the browser
		   driver.close();
	}

}
