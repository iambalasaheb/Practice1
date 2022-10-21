package seleniumbasicassignment;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagination1 {

	public static void main(String[] args) throws InterruptedException {
        //set browser path
		String path=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//creating an instance of
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//call the url
		driver.get("https://www.gsmarena.com/tecno-phones-120.php");
		//using list webelement return type
		List<WebElement> ref=driver.findElements(By.cssSelector(".nav-pages>a"));
		if(ref.size()>0) {
			System.out.println("pagination exist");
		}else {
			System.out.println("pagination does not exist");
		}
		//print links by using for-eachloop
		for(WebElement a:ref){
			System.out.println(a.getText());
		}
		//for every page url
		ref=driver.findElements(By.cssSelector(".nav-pages>a"));
		for(int i=0;i<ref.size();i++){
			System.out.println(driver.getCurrentUrl());
			ref.get(i).click();
			//explixit wait
			Thread.sleep(2000);
			//to avoid staleelement exception identify the pagination link
			ref=driver.findElements(By.cssSelector(".nav-pages>a"));
		}
		
		
	}

}
