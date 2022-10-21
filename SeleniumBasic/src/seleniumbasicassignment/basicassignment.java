package seleniumbasicassignment;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
public class basicassignment {

	public static void main(String[] args) {
    String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", driverpath);
    //creating an onject
    WebDriver driver=new ChromeDriver();
    
    //get given url
    driver.get("https://opensource-demo.orangehrmlive.com/");
    //print page url of above address and validate it by using equals
    String expectedurl="https://opensource-demo.orangehrmlive.com/";
    String currenturl=driver.getCurrentUrl();
    System.out.println("validation of url= "+currenturl.equals(currenturl));
    //print page title of above address and validate it by using equals
    String expectedtitle="OrangeHRM";
    String currenttitle=driver.getTitle();
    System.out.println("title validation= "+expectedtitle.equals(currenttitle));
    //get page source and print length
    int pagesource=driver.getPageSource().length();
    System.out.println("pagesource length= "+pagesource);
    //calling close method
    driver.close();
	}

}
