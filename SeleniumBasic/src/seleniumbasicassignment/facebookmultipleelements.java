package seleniumbasicassignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookmultipleelements {

	public static void main(String[] args) {
		//set the path of browser
				String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver",driverpath );
				//create an generic instance
				WebDriver driver=new ChromeDriver();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//to enter required url
				driver.get("https://www.facebook.com/");
				//validation of home page by using url
				String currenturl=driver.getCurrentUrl();
				String requiredurl="https://www.facebook.com/";
				System.out.println(currenturl.equals(requiredurl));
				//click on create account button
				WebElement ref=driver.findElement(By.id("u_0_0_rI"));
				ref.click();
				//perform operations on date month year dropdown
				//visibility of dropdown
				WebElement ref1=driver.findElement(By.id("u_9_l_qr"));
				ref1.click();
				System.out.println("visible or not= "+ref1.isDisplayed());
				System.out.println("is enable or not= "+ref1.isEnabled());
//				System.out.println("is multiselect or not "+ref1.isSelected());
//				System.out.println("options count= "+ref1.getSize());
//				System.out.println("name of blocks= "+ref1.getText());
				//System.out.println("default value= "+ref1.);
				
				
	}

}
