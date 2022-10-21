package DropdownHandelling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) {
		//seth the path of currrent working directory
   String path=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
   System.setProperty("webdriver.chrome.driver", path);
   //creating an instance of chromedriver and upcateing to webdriver
   WebDriver driver=new ChromeDriver();
   //maximize the browser
   driver.manage().window().maximize();
   //implicit wait
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   //open required url
   driver.get("http://demo.automationtesting.in/Register.html");
   //identify the dropdown list
   WebElement dropdn=driver.findElement(By.xpath("//select[@id='Skills']"));
   //to perform post operation of dropdown create an instance of select class and pass the 
   //inspected element to its constructor
   Select select=new Select(dropdn);
   //check the type of dropdown is multisect or not
   System.out.println("is multiselect or not= "+select.isMultiple());
   //get default or allredy selected options
   WebElement selectedoptin=select.getFirstSelectedOption();
   String name=selectedoptin.getText();
   //System.out.println("selected option= "+selectedoptin);
   //or
   System.out.println("allready selected option= "+select.getFirstSelectedOption().getText());
   //get option count
   List<WebElement> options=select.getOptions();
   System.out.println("option count is "+options.size());
   //print dropdown options names using for each lopp
   for(WebElement a:options) {
	   System.out.println(" :"+a.getText());
   }
   //validation dropdown skills are getting displayed in ascending order
   //List<WebElement> ascending=new <WebElement>();
   //select options using various methods of dropdown
   select.selectByIndex(0);
   System.out.println("allready selected option= "+select.getFirstSelectedOption().getText());
   select.selectByValue("Analytics");
   System.out.println("allready selected option= "+select.getFirstSelectedOption().getText());
   select.selectByVisibleText("Android");
   System.out.println("allready selected option= "+select.getFirstSelectedOption().getText());
   
   //perform validation on following year ascending order validation
   //month sequence validation
   //days asending order validation
   
   
	}

}
