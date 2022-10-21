package seleniumbasic;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class verificationloginpage {

	public static void main(String[] args) {
		//to set the path
      String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", driverpath);
      //to cretate instance
      WebDriver driver=new ChromeDriver();
  //to enter the require application url for open the browser
      driver.get("https://demo.actitime.com");
      //define an implicit wait for browser
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     //identify username field
      WebElement ref=driver.findElement(By.id("username"));
      System.out.println("username field is displyed or not= "+ref.isDisplayed());
      System.out.println("username field is enable or not= "+ref.isEnabled());
     String defaultvalueinusernameinputfield=ref.getAttribute("placeholder");
     System.out.println("default value of input field is= "+defaultvalueinusernameinputfield);
     System.out.println("default value of validation for username input field= "+defaultvalueinusernameinputfield.equals("Username"));
     //identify password field
     WebElement ref1=driver.findElement(By.name("pwd"));
     System.out.println("identify that password field id displayed or not= "+ref1.isDisplayed());
     System.out.println("identyfiy that pass field is enable or not= "+ref1.isEnabled());
     String passinputfield=ref1.getAttribute("placeholder");
     System.out.println("default value of input field= "+passinputfield);
     System.out.println("default value validation for password= "+passinputfield.equals("Password"));
     //login button
     WebElement ref2=driver.findElement(By.linkText("Login"));
     System.out.println("login button is displyed or not= "+ref2.isDisplayed());
     System.out.println("login button is enable or not= "+ref2.isEnabled());
     String loginfield=ref2.getText();
     System.out.println("default value of login= "+loginfield);
     //checkbox field
     WebElement ref3=driver.findElement(By.name("remember"));
     System.out.println("check box is displayed or not= "+ref3.isDisplayed());
     System.out.println("check box is ensble or not= "+ref3.isEnabled());
     System.out.println("check box is selected or not= "+ref3.isSelected());
     //identify for keep me login lebel
     WebElement ref4=driver.findElement(By.id("keepLoggedInLabel"));
     System.out.println("log in lable displyaed or not= "+ref4.isDisplayed());
     System.out.println("login label is enable or not= "+ref4.isEnabled());
     System.out.println("text of log in lebel= "+ref4.getText());
    //close the browser
     driver.close();
    
     
     
     
     
     
    
     
      
	}

}
