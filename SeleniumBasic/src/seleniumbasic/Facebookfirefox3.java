package seleniumbasic;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
public class Facebookfirefox3 {

	public static void main(String[] args) {
       String Driverpath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
       System.setProperty("webdriver.gecko.driver", Driverpath);
       //to create an object
       WebDriver driver1=new FirefoxDriver();
       //entre the url
       driver1.get("https://www.facebook.com");
       //open the url in current browser
       String expectedurl="https://www.facebook.com";
       String currenturl=driver1.getCurrentUrl();
       System.out.println("url validation of facebook is= "+expectedurl.equals(currenturl));
       //to check the title validation of facebook
       String currenttitle=driver1.getTitle();
       String Expectedtitle="Facebook – log in or sign up";
       System.out.println("facebook title validation is= "+currenttitle.equals(Expectedtitle));
       //close the browser
       driver1.close();
       
	}

}
