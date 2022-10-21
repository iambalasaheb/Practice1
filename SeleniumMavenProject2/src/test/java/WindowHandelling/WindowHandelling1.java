package WindowHandelling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class WindowHandelling1 {

	public static void main(String[] args) {
		//imoprt utility
		SeleniumUtility s=new SeleniumUtility();
		//open the browser using setup
		WebDriver driver=s.setUp("chrome", "https://etrain.info/in");
		//get current window open id from predefine windowhandel method and to print it
		String homepagewinid=driver.getWindowHandle();
		System.out.println("hame page window handel id: "+homepagewinid);
		//click on linked in page to open it in new window or tab
		driver.findElement(By.xpath("//i[@class='icon-linkedin']")).click();
		// get all windows unique id which are open by selenium current instance by using set<string>
		Set<String> totalwinid=driver.getWindowHandles();
		System.out.println("print all windows id open at current stage: "+totalwinid);
		//remove home win id from all win id then u wll get child win id
		totalwinid.remove(homepagewinid);
		System.out.println("after removing home win id: "+totalwinid);
		//now we get child window id by using iterator
		Iterator<String> itr= totalwinid.iterator();
		String childwinid=itr.next();
		driver.switchTo().window(childwinid);
		//or u can write like this also
	//	driver.switchTo().window(totalwinid.iterator().next());
		
		//now u can perform required operation in child window like title and url
		System.out.println("get the title of child window: "+driver.getTitle());
		System.out.println("get the url of child window: "+driver.getCurrentUrl());
		//close cureent instance of browser
	//	driver.close();//it close only current child window browser
		
		//when we need to get back on home page win. and perform required operation
		driver.switchTo().window(homepagewinid);
		//now u can perform required opertaion on parent page
		System.out.println("get the title of home page: "+driver.getTitle());
		System.out.println("get the url of home page: "+driver.getCurrentUrl());
		//close current instance of browser
	//	driver.close();
		
		//if u wnat to close all windows or tabs then we can use
		driver.quit();
		
		
		
		
		


	}

}
