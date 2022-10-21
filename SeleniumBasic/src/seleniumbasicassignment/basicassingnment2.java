package seleniumbasicassignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
public class basicassingnment2 {

	public static void main(String[] args) {
     String driverpath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
     System.setProperty("webdriver.gecko.driver", driverpath);
     //creating object
     WebDriver driver=new FirefoxDriver();
     //get url
     driver.get("https://demo.automationtesting.in/Register.html");
     //print page title and validate it
     String expectedtitle="Register";
     String currenttitle=driver.getTitle();
     //instead of equals method used cantains method
     System.out.println("title validation= "+expectedtitle.contains(currenttitle));
     //print url and validate
     String expectedurl="https://demo.automationtesting.in/Register.html";
     String currenturl=driver.getCurrentUrl();
     System.out.println("url validation= "+expectedurl.equals(currenturl));
     //get page source and print its length
     int pagesource=driver.getPageSource().length();
     System.out.println("page source length= "+pagesource);
     //close browser
     driver.close();
     
	}

}
