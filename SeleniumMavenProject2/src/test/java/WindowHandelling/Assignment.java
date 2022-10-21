package WindowHandelling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.SeleniumUtility;

public class Assignment {

	public static void main(String[] args) {
		/* Assignment
		https://erail.in/
		click on eCatering
		enter train number 12627
		click submit
		click on one by one all the stops and get available restaurant count and name
		*/
		SeleniumUtility s1=new SeleniumUtility();
		//open browser
		WebDriver driver=s1.setUp("chrome", "https://erail.in/");
		//click on ecatering its tacking to new window
		String homewin=driver.getWindowHandle();
		System.out.println("home window id = "+homewin);
		//now identifying child window ie e catering
		driver.findElement(By.xpath("//a[text()='eCatering']")).click();
		//now identify the all windows id by using winhandells method
		Set<String> totalwinid=driver.getWindowHandles();
		System.out.println("printing all windows= "+totalwinid);
		//now we need to remove child win from total win
		totalwinid.remove(homewin);
		System.out.println("the child window id= "+totalwinid);
		//get th child window by using iterator
		Iterator<String> itr=totalwinid.iterator();
		String childwinid=itr.next();
		driver.switchTo().window(childwinid);
		//now we can perform above given reuired operation i.e enter train no.12627
		driver.findElement(By.xpath("//input[@class='form-input pl-10  h-16 pl-12 text-lg shadow-6dp pr-4']")).click();
		WebElement serchtrain=driver.findElement(By.xpath("//input[@class='form-input pl-10  text-sm']"));
		serchtrain.click();
		serchtrain.sendKeys("12627");
		//after train number select train 
		driver.findElement(By.xpath("//button[@class='body-3 text-gray-60 h-10 px-4 w-full text-left leading-relaxed ']")).click();
		//provide boarding date passing 12/10/22,select boarding station
		driver.findElement(By.xpath("//input[@placeholder='Boarding Date']")).click();
		driver.findElement(By.xpath("//*[@id=\"modal\"]/div[4]/div/div/div[2]/div/div[1]/input")).click();
		//dropdown handelling select yelhanka station from dropdown by using select class
		driver.findElement(By.xpath("//select[@placeholder='Boarding Station']")).click();
		driver.findElement(By.xpath("//select/option[@value='YNK']")).click();	
		//hit on the food option
		driver.findElement(By.xpath("//button[@class='btn-primary w-full']")).click();
		
		
		
		
		
		

		
		
	}

}
