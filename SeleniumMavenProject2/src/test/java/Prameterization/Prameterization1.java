package Prameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Prameterization1 extends SeleniumUtility {
	
@Parameters({"browser"})
  @Test
  public void TestCase1(String browser) {
	System.out.println("browser passed as browser: "+browser);
  }
@Parameters({"username","password"})
@Test
public void TestCase2(String username,String password) {
	System.out.println("parameters for username: "+username);
	System.out.println("parameters for password: "+password);
}
@Parameters({"browser","username","password"})
@Test
public void TestCase3(String browser,String username,String password) {
	System.out.println("browser passed as browser: "+browser);
	System.out.println("parameters for username: "+username);
	System.out.println("parameters for password: "+password);
}
@Parameters({"browser","username","password"})
@Test
public void testLoginOfVtiger(String browser,String username,String password) {
	setUp(browser,"https://demo.vtiger.com/vtigercrm/index.php");
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys(password,Keys.ENTER);
	
}
}
