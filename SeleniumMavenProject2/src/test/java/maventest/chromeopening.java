package maventest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.SeleniumUtility;

public class chromeopening {

	public static void main(String[] args) {
		//import the utility
      SeleniumUtility s1=new SeleniumUtility();
      //calling setup method
      WebDriver driver=s1.setUp("chrome","https://www.ecatering.irctc.co.in/");
      //inspect the search station and select train 
      driver.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']")).click();     
      WebElement trainNum = driver
				.findElement(By.xpath("//input[@placeholder='Start typing Nagpur, NGP, Rajdhani']"));
      //applay wait
      s1.waitTillElementIsClickable(trainNum);
      trainNum.sendKeys("12627");
      WebElement selecttrain=driver.findElement(By.xpath("//div[div[span[text()='Trains']]]/button"));
      s1.waitTillElementIsClickable(selecttrain);
      selecttrain.click();
      
      driver.findElement(By.name("date")).click();
      //by using for loop
      for(int i=0;i<5;i++) {
    	  driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
      }
      driver.switchTo().activeElement().sendKeys(Keys.ENTER);
      //by using select class
      Select select=new Select(driver.findElement(By.xpath("//select[@placeholder='Boarding Station']")));
      select.selectByVisibleText("Yelhanka Jn - YNK");
    
	}

}
