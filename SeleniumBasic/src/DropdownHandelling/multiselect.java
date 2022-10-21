package DropdownHandelling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect {

	public static void main(String[] args) throws InterruptedException {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath );
		//create an generic instance
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Open facebook to enter required url 
		driver.get("http://omayo.blogspot.com/");
		//identify dropdown list by inspect
		WebElement cardropdown=driver.findElement(By.xpath("//select[@id='multiselect1']"));
		//create an instance of select class and pass the above reference into its constructor
		Select selectskill=new Select(cardropdown);
		//check dropdown is multiselect or not
		System.out.println("dropdown is multiselect= "+selectskill.isMultiple());
		
		//get defaulted selected options
//		System.out.println("default select options= "+selectskill.getFirstSelectedOption().getText());
		
		//get option counts
		List<WebElement> option=selectskill.getOptions();
		System.out.println("option count= "+option.size());
		//get dropdown option names by using for loop
		for(int i=0;i<option.size();i++) {
			System.out.println(option.get(i).getText());
		}
		
		//select options from dropdown
		selectskill.selectByIndex(1);
//		selectskill.selectByValue("Hundaix");
//		selectskill.selectByVisibleText("Audi");
		//get all the selected options
		List<WebElement> selectcars=selectskill.getAllSelectedOptions();
		System.out.println("selected car counts= "+selectcars.size());
		
		//unselect already select options
//		selectskill.deselectByIndex(1);
//		selectskill.deselectByValue("Hundaix");
//		selectskill.deselectByVisibleText("Audi");
//		selectskill.deselectAll();
//		//close the browser
		driver.close();
		
	}

}
