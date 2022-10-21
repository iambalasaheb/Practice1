package seleniumbasicassignment;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class Programloginpage2 {

	public static void main(String[] args) {
		//get path for firefox browser
		String driverpath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		//set the path using set property method
		System.setProperty("webdriver.gecko.driver", driverpath);
		//create an instance of geckodriver
		WebDriver driver=new FirefoxDriver();
		
         //open browser firefox browser
		driver.get("https://demo.actitime.com/login.do");
		//verify login page by using url validation
		String currenturl=driver.getCurrentUrl();
		System.out.println("url validation for login page= "+currenturl.equals("https://demo.actitime.com/login.do"));
		//verify user name
		WebElement ref=driver.findElement(By.id("username"));
		ref.clear();
		ref.sendKeys("admin");
		//verify password slot
		WebElement ref1=driver.findElement(By.name("pwd"));
		ref1.clear();
		ref1.sendKeys("manager");
		//verify click button
		WebElement ref2=driver.findElement(By.linkText("Login"));
        ref2.click();
        //close the browser
        driver.close();
		
	}

}
