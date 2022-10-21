package seleniumbasic;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Flipcartvalidationfirefox2 {

	public static void main(String[] args) {
       //using System class
       String driverpath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
       //set driver executable path
       System.setProperty("webdriver.gecko.driver", driverpath);
       //to create object
       WebDriver driver=new FirefoxDriver();
       //enter url
       driver.get("https://www.flipkart.com");
       //validate page title
      String PageTitle=driver.getTitle();
      String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
       System.out.println("title validation "+PageTitle.equals(expectedTitle));
   //validate urls
       String CurrentURL=driver.getCurrentUrl();
       String ExpectedURL="https://www.flipkart.com/";
       System.out.println("url validation "+CurrentURL.equals(ExpectedURL));
    //get page source content length count
       int Contentlength=driver.getPageSource().length();
       System.out.println("content count "+Contentlength);
       //close browser
       driver.close();
       
       	}
  }
