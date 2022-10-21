package seleniumbasic;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;;
public class Vtigerlogin {

	public static void main(String[] args) {
   //to create path using get
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//to set the the driver executable path
		System.setProperty("webdriver.chrome.driver", driverpath);
		//by creating object and up-casting it to WebDriver interface
		//ChromeDriver cdriver=new ChromeDriver(); //or
		WebDriver driver=new ChromeDriver();
		//providing the open browser url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		/**
		 * to perform any operation first we need to identify the object/element from the 
		 * application dn you can perform any required operation:
		 * 		input type: sendkeys("Input");
		 * 		click	  : click();
		 * 		existing text deletion: clear();
		 */
		//identify user name field
		WebElement username=driver.findElement(By.id("username"));
		//perform required operation in username field
		username.clear();
		username.sendKeys("admin");
		//identify the passward field
		WebElement password=driver.findElement(By.name("password"));
		//perform required operation in password field
		password.clear();
		password.sendKeys("Test@123");
		//identify sign in button
		WebElement signinbutton=driver.findElement(By.className("buttonBlue"));
		//perform required operation in sign in button
		signinbutton.click();
		driver.close();		
	}

}
