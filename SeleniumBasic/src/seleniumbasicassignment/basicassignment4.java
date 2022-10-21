package seleniumbasicassignment;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
public class basicassignment4 {

	public static void main(String[] args) {
   //get property driverpath
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//set the driver executable path using set property
		System.setProperty("webdriver.chrome.driver", driverpath);
		//creating object
		WebDriver driver=new ChromeDriver();
		//adding application url in open browser
		driver.get("https://www.amazon.in/");
		//to print and validate title of the application
		String expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String currenttitle=driver.getTitle();
		System.out.println("title validation of amazon= "+expectedtitle.equals(currenttitle));
		//to print and validate url of the application
		String expectedurl="https://www.amazon.in/";
		String currenturl=driver.getCurrentUrl();
		System.out.println("validation of amazon url= "+expectedurl.equals(currenturl));
		//get pagesource and print its length
		double pagesource=driver.getPageSource().length();
		System.out.println("page source length= "+pagesource);
		//close the application
		driver.close();
	}

}
