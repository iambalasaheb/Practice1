package seleniumbasic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class chrome3 {

	public static void main(String[] args) {
    String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", driverpath);
    //creating an object of chromedriver
    WebDriver driver=new ChromeDriver();
    //enter the url
    driver.get("https://demo.actitime.com");
    //by using expected and current url
    String CurrentUrl=driver.getCurrentUrl();
    String ExpectedUrl="\"https://demo.actitime.com/";
    System.out.println("check url validation= "+ExpectedUrl.equals(CurrentUrl));
    //check title of the the given page
    String CurrnrtTitle=driver.getTitle();
    String ExpectedTitle="actiTIME - Login";
    System.out.println("check title validation= "+CurrnrtTitle.equals(ExpectedTitle));
    //check page source and page source length
   int Pagesource=driver.getPageSource().length();
    System.out.println("page source length= "+Pagesource);
    //close the browser
    driver.close();
	}

}
