package seleniumbasicassignment;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class verifyloginpage3 {
	
		public static void main(String[] args) throws InterruptedException {
			//seth the path
	    String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", driverpath);
	    //cretae an istance
	    WebDriver driver=new ChromeDriver();
	    //provide the url for open browser
	    driver.get(" https://opensource-demo.orangehrmlive.com/");
	    //implicit wait
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //verify login page elements
	    //verify usernsme
	    WebElement ref=driver.findElement(By.id("txtUsername"));
	    System.out.println("username field is displyed or not= "+ref.isDisplayed());
	    System.out.println("username is eneble or not= "+ref.isEnabled());
	    //verify password field
	    WebElement ref2=driver.findElement(By.id("txtPassword"));
	    System.out.println("password is displed or not= "+ref2.isDisplayed());
	    System.out.println("password is enabled or not= "+ref2.isEnabled());
	    //verify for login
	    WebElement ref3=driver.findElement(By.id("btnLogin"));
	    System.out.println("login button is displyed or not= "+ref3.isDisplayed());
	    System.out.println("login button is enebled or not= "+ref3.isEnabled());
	    String loginbutton=ref3.getAttribute("value");
	    System.out.println("text on login button= "+loginbutton);
	    //identify forgot ur password lebel
	    WebElement ref4=driver.findElement(By.linkText("Forgot your password?"));
	    System.out.println("lable is displyaed or not= "+ref4.isDisplayed());
	    System.out.println("label is enable or not= "+ref4.isEnabled());
	    System.out.println("text of label= "+ref4.getText());
	    //by using explecit wait
	   Thread.sleep(2000);
	   //verify for login pannel
	    WebElement ref5=driver.findElement(By.id("logInPanelHeading"));
	    System.out.println("loginpanel lebel is displyed or not= "+ref5.isDisplayed());
	    System.out.println("log in panel lebal is enable or not= "+ref5.isEnabled());
	    System.out.println("log in panel is selected or not= "+ref5.isSelected());
	//verify image
	    WebElement ref6=driver.findElement(By.tagName("image"));
	    System.out.println("logo of hrm is displyed or not= "+ref6.isDisplayed());
	    System.out.println("logo of hrm is eneble or not= "+ref6.isEnabled());
	    System.out.println("logo of hrm is selected or not= "+ref6.isSelected());
	//emter username and password
	    ref.sendKeys("Admin");
	    //entere password
	    ref2.sendKeys("admin123");
	    ref3.click();
	    System.out.println("login is successfully done");
	    //to close the browser
	    driver.close();
		}
}
/**
 * Username input field:
 * 			1. display
 * 			2. editable
 * 			3. default
 * Login button:
 * 			1. display
 * 			2. functional
 * 			3. button name
 * Keep me logged in check-box/radio button:
 * 			1. display
 * 			2. functional
 * 			3. selection
 * link:
 *			1. display
 * 			2. functional
 * 			3. link name
 * dropdown:
 * 			1. display
 * 			2. functional
 * 			3. default value
 * 			4. change value is reflecting or not
 * 			5. total option
 * 			6. multi select 
 * 
 * isDisplayed() --> To check visibility of any WebElement we can user this
 * 				true --> display/visible
 * 				false--> not displayed / not visible
 * isEnabled() ---> to check whether the WebElemenet is functional or not
 * 				true --> editable/functional
 * 				false --> non editable/non-functional
 * isSelected()---> to check whether radio button/check box is selected or not
 * 				true ---> selected
 * 				false---> not selected
 * getAttribute("attribute_name")--> use to get the attribute name which is passed in
 * 									 this method as parameter in form String
 * getText()--> give the inner text for the WebElement from HTML
 * 
 *	<p> inner text</p>
 *	<a...> inner text</a>
 *	<div..> inner text</div>
 */	