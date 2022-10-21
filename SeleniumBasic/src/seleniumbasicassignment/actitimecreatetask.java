package seleniumbasicassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimecreatetask {

	public static void main(String[] args) throws InterruptedException {
     //set the path
		String path=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//create an instance
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		//input cretes
		WebElement ref=driver.findElement(By.id("username"));
		ref.sendKeys("admin");
		WebElement ref1=driver.findElement(By.name("pwd"));
		ref1.sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		driver.findElement(By.cssSelector("#container_tasks")).click();
		//click on add new
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
       //click on add task		
		driver.findElement(By.cssSelector(".item.createNewTasks")).click();
		//select project
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='dropdownButton']")).click();
		//enter project
		driver.findElement(By.cssSelector(".itemRow.cpItemRow.selected'] ")).click();
        //add task in first input task 	
		Thread.sleep(2000);
		WebElement ref2=driver.findElement(By.cssSelector("tr>td>input[class='inputFieldWithPlaceholder']"));
		ref2.click();
		ref2.sendKeys("balasaheb");
        //click on checkbox	
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".checkmark.checkMark")).click();
        //click on create task		
		driver.findElement(By.cssSelector("div[class='components_button_label']")).click();
		//select creteted project
		driver.findElement(By.cssSelector("div[class='img']")).click();
		//delete selected project or task
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".delete.button")).click();
        //delete permenantly
		driver.findElement(By.cssSelector("span[class='submitTitle buttonTitle']")).click();
		//click on logout
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#logoutLink")).click();
		System.out.println("program ends");


		
		
		

	}

}
