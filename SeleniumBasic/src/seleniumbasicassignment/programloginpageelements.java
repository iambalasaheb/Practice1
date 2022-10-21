package seleniumbasicassignment;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class programloginpageelements {

	public static void main(String[] args) {
   //to setting the path to the driver executables
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		//creating instance of chrome browser and up casting it to webdriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application url to set of web driver interface
		driver.get("https://demo.actitime.com");
        //implicite wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to get title from the application
		String currenttitle=driver.getTitle();
		String expectedtitle="actiTIME - Login";
		System.out.println("current title= "+currenttitle);
		System.out.println("length of current title= "+currenttitle.length());
		//validating login page
		System.out.println("validation of login page by using title= "+currenttitle.equals(expectedtitle));
		//identify and perform required operations
		//type user name as admin
		driver.findElement(By.id("username")).sendKeys("admin");
		//type password as manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//simillerly click on login button
		driver.findElement(By.linkText("Login")).click();
		//explicite wait (staic wait)
		try {
		Thread.sleep(2000);}
		catch(Throwable a) {
			System.out.println(a);
		}
		//verify home page again
		String currenttitle1=driver.getTitle();
		System.out.println("home page validation= "+currenttitle1.equals("actiTIME - Login"));
	//click on logout link
		driver.findElement(By.id("logoutLink")).click();
		//verify login page using above title validation statement
System.out.println("validation of login page by using title= "+currenttitle.equals(expectedtitle));
	//closing the browser
driver.close();		
		
	}

}
/*
1. Open any browser
2. Enter the url as https://demo.actitime.com/login.do
3. Verify login page
3. Username as admin
4. password as manager
5. click on Login button 
6. verify home page
7. click on logout link
8. verify login page is opened or not
9. close the browser
*/

/**
 * In order to perform any operation on any element first identify it from WebPage, for that use findElement()
 * 
 * WebElement element= findElement(By.locator()); --> use to identify the element from the Web page and return WebElement
 * 				---> By ---> predefined class which has several static method known as locators
 * 						--->id(string), name(string), linkText(string), partialLinkText(string)
 * 							className(string), tagName(string), cssSelector(String), xpath(String)
 * Once you identified the element, you can perform the required operation like-
 * 1. type				--> element.sendKeys("");
 * 2. click				--> element.click();
 * 3. delete existing text-> element.clear();
 */
