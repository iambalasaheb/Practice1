package seleniumbasic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicoperationonbrowser1 {

	public static void main(String[] args) {
//using system class
		String driverPath3=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//set the driver executable path using system.set properties(String key, String value)
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();//upcating object created
		
		//need to enter application URL in the opened browser
        driver.get("https://www.google.com");
        //expected page url
        String expectedUrl="https://www.google.com";
        //get the enterd url from opended browser
        String appCurrentUrl=driver.getCurrentUrl();
       System.out.println("Actual url "+appCurrentUrl);   
       System.out.println("Expected url "+expectedUrl);
       //using if else ststement
       if(appCurrentUrl.contains(expectedUrl)) {
    	   System.out.println("current url validation is pass");
       }else {
    	   System.out.println("current url validation is failed");
       }
       //verify that google search page is open or not using title
       String actualTitle=driver.getTitle();
       String expectedTitle="Google";
       System.out.println("Actualtitle "+actualTitle);
       System.out.println("Actualtitle "+actualTitle);
       //using if else ststement
      if(actualTitle.contains(expectedTitle))  {
	    System.out.println("Title validation is passed");
     }else {
	    System.out.println("Title validation is Faield");
      }
       //get the webpage source cantain
       String SourceContent=driver.getPageSource();
       System.out.println("source cantain length "+SourceContent.length());
       //close cuurent browser
       driver.close();
	}

}
/**
 * Open Chrome browser
 * Enter google search page url
 * validate URL is entered properly or not
 * validate google search page is open or not
 * once all the validation are performed close the browser
 */ 
