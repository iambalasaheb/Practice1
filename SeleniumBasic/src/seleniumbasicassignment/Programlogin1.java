package seleniumbasicassignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Programlogin1 {

	public static void main(String[] args) {
   //to create path using get method
    String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		//creating an instatnce of chromedriver
		WebDriver driver=new ChromeDriver();
		//link for open the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//verify login home page by using title validation
		String currenttitle=driver.getTitle();
		String expectedtitle="OrangeHRM";
		System.out.println("title validation= "+expectedtitle.equals(currenttitle));
		//verify username as a admin
		WebElement ref=driver.findElement(By.id("txtUsername"));
		ref.clear();
		ref.sendKeys("admin");
		//verify password as a admin123
		WebElement ref1=driver.findElement(By.id("txtPassword"));
		ref1.clear();
		ref1.sendKeys("admin123");
		//for click on login button
		WebElement ref2=driver.findElement(By.name("Submit"));
		ref2.click();
		//verify home page by using url
		String currenturl=driver.getCurrentUrl();
		String expectedurl="https://opensource-demo.orangehrmlive.com/";
		System.out.println("url validation= "+currenturl.equals(expectedurl));
		//close the browser
		driver.close();


	}

}
