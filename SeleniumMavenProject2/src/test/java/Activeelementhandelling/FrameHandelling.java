package Activeelementhandelling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class FrameHandelling {

	public static void main(String[] args) {
		// import seleniumutility
	SeleniumUtility s1=new SeleniumUtility();
	//call the setup method
	WebDriver driver=s1.setUp("chrome", "https://jqueryui.com/");
	//inspect the element of dropable
	driver.findElement(By.xpath("//a[text()='Droppable']")).click();
	//identify the frame element
	WebElement frameobject=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	//switch your control on frame from main page after inspection of element
	//driver.switchTo().frame("frameobject");
	//or we can also used base on index based
	driver.switchTo().frame(0);
	//now u can allow to perform any operation in frame
	//identify drag box
	WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
	//identify drop box
	WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
	//perform operation to dragable frame drop into dropable frame
	//calling drag and drop method
	SeleniumUtility.action.dragAndDrop(drag , drop).perform();
	//if u required to perform any operation on main page or out of frame then need to shifted focus on main page
	driver.switchTo().defaultContent();
	//now u can control home page
	//for going to home page click on logo then nedd to identify element
	driver.findElement(By.xpath("//li[2]/a[@title='jQuery UI']")).click();
	

	
	}

}
