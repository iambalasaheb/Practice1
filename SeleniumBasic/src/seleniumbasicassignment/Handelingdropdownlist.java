package seleniumbasicassignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handelingdropdownlist {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//seth the path of driver
		System.setProperty("webdriver.chrome.driver", path);
		//cretae an instance of driver
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximize the window
		driver.manage().window().maximize();
		//get url
		driver.get("http://demo.automationtesting.in/Register.html");
		//identify dropdown list
		WebElement skiildropdown=driver.findElement(By.cssSelector("#Skills"));
		//create an instance of select class and pass above element into its constructor
		Select select=new Select(skiildropdown);
		//**** check whether dropdown is multiselect dropdown or not
        System.out.println("is dropdown is multiselect or not= "+select.isMultiple());
        //get default or allready select options
        WebElement selectedoption=select.getFirstSelectedOption();
        String selectedoptionname=selectedoption.getText();
        System.out.println("already selected option name= "+selectedoptionname);
        //or
        System.out.println("already selected option name= "+select.getFirstSelectedOption().getText());
        //get option count
        List<WebElement> options=select.getOptions();
        System.out.println("option count is= "+options.size());
        //get dropdown option names
        for(int i=0;i<options.size();i++) {
        	System.out.println("option "+i+": "+options.get(i).getText());        	
        }
		//validation dropdown skills are geting displyed in ascending order
        
        //select options from dropdown
        select.selectByIndex(4);
        System.out.println("already selected option name= "+select.getFirstSelectedOption().getText());
        //or
        select.selectByValue("Backup Mnagement");
        System.out.println("already selected option name= "+select.getFirstSelectedOption().getText());
        //or
        select.deselectByVisibleText("Analytics");
        System.out.println("already selected option name= "+select.getFirstSelectedOption().getText());
        //perform validations on following
            //1. Year(ascending order validation)
      		//2. Month(month Sequence validation)
      		//3. Days(ascending order validation)        		
	}

}
