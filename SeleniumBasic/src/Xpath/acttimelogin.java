package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class acttimelogin {

	public static void main(String[] args) {
		//set path to the browser
		   String path=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		   System.setProperty("webdriver.chrome.driver", path);
		   //create an instance of webdriver
		   WebDriver driver=new ChromeDriver();
		   //hit url to get open browser
		   driver.get("https://demo.actitime.com");
		 //title validation of acttime
		   String expectedtitle="actiTIME - Login";
		   String Currenttitle=driver.getTitle();
		   System.out.println("page title= "+Currenttitle);
		   System.out.println("page title length= "+Currenttitle.length());
		   System.out.println("title validation of title= "+expectedtitle.equals(Currenttitle));
		 //get page url and validate it
		   String expectedurl="https://demo.actitime.com/login.do";
		   String currenturl=driver.getCurrentUrl();
		   System.out.println("validation of page url= "+expectedurl.equals(currenturl));
		   //enter valid username
		   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		   //enter valid password
		   driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		   //hit login button
		   driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		   //get the title in console
		   System.out.println("title of page= "+driver.getTitle());
		   //close the browser
		   driver.close();
		   
	}

}
