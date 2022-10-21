package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath );
		//create an generic instance
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Open facebook to enter required url 
		driver.get("https://www.facebook.com/");
		//validate home page by using url
		String  expectedurl="https://www.facebook.com/";
		System.out.println("page validation= "+expectedurl.equals(driver.getCurrentUrl()));		
		//click on create account button
		driver.findElement(By.xpath("//div[@class='_6ltg']/a[@role='button']")).click();
		/*perform following operation to date month and year dropdown visible,enable,multiselect,
		option count,name,default value,change value and check the update value
		*/
		WebElement date=driver.findElement(By.xpath("//span[@class='_5k_4']"));
		System.out.println("dropdown is visible= "+date.isDisplayed());
		System.out.println("dropdown is enable = "+date.isEnabled());
		System.out.println("is multiselect or not= "+date.isSelected());
		System.out.println("options count= "+date.getSize());
		System.out.println("name= "+date.getText());
	//remaning operation required dropdown handelling concepts
		
	}
}
