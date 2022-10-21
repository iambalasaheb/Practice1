package seleniumbasicassignment;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class verifyloginelements2 {

	public static void main(String[] args) {
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
   try { Thread.sleep(2000);
   
   }catch(Throwable a) {
	   System.out.println(a);	   
   }
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
//closing browser
    driver.close();

	}

}
