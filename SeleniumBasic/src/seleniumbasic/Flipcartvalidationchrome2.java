package seleniumbasic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcartvalidationchrome2 {

	public static void main(String[] args) {
      //using system class
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
       System.setProperty("webdriver.chrome.driver", driverpath);
       //create an instance of browser current class
       WebDriver driver=new ChromeDriver();
 
       //enter the url
       driver.get("https://www.flipkart.com");
       //by using expected and current url
		String Expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	    String pageTitle=driver.getTitle();
	    //compare 2 string by using equal method
	    System.out.println("title validation "+pageTitle.equals(Expectedtitle));
	    //validate current url
	    String pageURL=driver.getCurrentUrl();
	    String expectedURL="https://www.flipkart.com/";
	    //compare 2 string by using equal method
	    System.out.println("url validation "+pageURL.equals(expectedURL));
	    //get page source count length count
	    int contentlength=driver.getPageSource().length();
	    System.out.println("content length "+contentlength);
	    //close the browser
	    driver.close();

	}

}
