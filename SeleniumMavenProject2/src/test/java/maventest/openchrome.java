package maventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openchrome {

	public static void main(String[] args) {
		//browser instance
    WebDriverManager.chromedriver().setup();
    //create an instance of required browser class
    WebDriver driver=new ChromeDriver();
    //open the browser
    driver.get("https://www.google.com");
    
	}

}
