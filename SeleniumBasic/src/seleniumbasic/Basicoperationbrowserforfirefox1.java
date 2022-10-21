package seleniumbasic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Basicoperationbrowserforfirefox1 {

	public static void main(String[] args) {
      String Driverpath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		//set the driver executable path using system.set properties(String key, String value)
       System.setProperty("webdriver.gecko.driver", Driverpath);
		//create an instance of required browser class
            WebDriver driver=new FirefoxDriver();
			//need to enter application URL in the opened browser
            driver.get("https://www.google.com");
            //expected page url
            String expectedUrl="https://www.google.com";
            //get the entered url from open page
            String appCurrentUrl=driver.getCurrentUrl();
            //printing in syso
            System.out.println("current url "+appCurrentUrl);
            System.out.println("expected url "+expectedUrl);
            //using if eles ststement
            if(appCurrentUrl.contains(expectedUrl)) {
            	System.out.println("current url validation is passed");
            }else {
            	System.out.println("current url validation is failed");
            }
            //verify that google search paged is open or not using title
            String expectedtitle="Google";
            //expected and actual titled
            String actualtitle=driver.getTitle();
            System.out.println("actual titled "+actualtitle);
            System.out.println("expected titled "+expectedtitle);
            if(actualtitle.contains(expectedtitle)) {
            	System.out.println("title validation is passed");
            }else {
            	System.out.println("titled validation faield");
            }
        //get the webpage source contain
            String sourcecontent=driver.getPageSource();
            System.out.println("source cantain length "+sourcecontent.length());
            //close current browser
            driver.close();
	}

}
