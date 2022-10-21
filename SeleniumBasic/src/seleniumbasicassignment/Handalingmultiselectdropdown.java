package seleniumbasicassignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handalingmultiselectdropdown {

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
		driver.get("http://omayo.blogspot.com/");
		//identify dropdown list
		WebElement cardropdown=driver.findElement(By.id("multiselect1"));
		//cretete an instance of select class and pass and pass above element into its constructor
		Select selectskill=new Select(cardropdown);
		//check dropdown is multiselect or not
		System.out.println("dropdown is multiselect or not= "+selectskill.isMultiple());
		//get default or allready selected options
		//WebElement selectedOption=selectSkill.getFirstSelectedOption();
		//String selectedOptionName=selectedOption.getText();
		System.out.println("default selected options= "+selectskill.getFirstSelectedOption().getText());
		//get option count
		List<WebElement> options=selectskill.getOptions();
		System.out.println("option count is= "+options.size());
		//get dropdown option names
		for(int i=0;i<options.size();i++) {
			System.out.println("options"+i+" "+options.get(i).getText());			
		}
      //select options for dropdown
		selectskill.selectByIndex(0);
		selectskill.selectByIndex(2);
		selectskill.selectByIndex(3);
		//selectSkill.selectByValue("Hyundaix");
		//selectSkill.selectByVisibleText("Audi");
		//get all selected options
		List<WebElement> selectcars=selectskill.getAllSelectedOptions();
		System.out.println("options count is= "+selectcars.size());
		//unselect allready selected options
		selectskill.deselectByIndex(0);
//		selectskill.deselectByValue("Hyundaix");
//		selectskill.deselectByVisibleText("Audi");
				//or
		selectskill.deselectAll();	
		
	}

}
