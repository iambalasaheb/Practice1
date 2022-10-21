package seleniumbasicassignment;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
public class basicassignment3 {

	public static void main(String[] args) {
		//get the driver executable path using string and get property method and concate with executable
		String driverpath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
      //set the driver executable path using set property method key,value basis
		System.setProperty("webdriver.gecko.driver", driverpath);
		//create an object/instance of the class
		WebDriver driver=new FirefoxDriver();
		//adding application url in open browser
		//driver.get("http://sampleapp.tricentis.com/101/");
		//print pagetitle and validate it
		String expectedtitle="Tricentis Vehicle Insurance";
		String currenttitle=driver.getTitle();
		System.out.println("title validation= "+expectedtitle.equals(currenttitle));
		//print application url and validate it
		String currenturl=driver.getCurrentUrl();
	    String expectedurl="http://sampleapp.tricentis.com/101/";
	    System.out.println("validation of url= "+currenturl.equals(expectedurl));
	    //get pagesource and print its length
	    int pagesource=driver.getPageSource().length();
	    System.out.println("page length= "+pagesource);
	    //to close the browser
	    driver.close();
	}

}
