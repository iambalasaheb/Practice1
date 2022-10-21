package Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotation2 {
	@BeforeMethod
	@BeforeTest
	public void setUp() {
		System.out.println("Open browser and login into application");
	}
	@Test(priority=1)
	public void taskCreation() {
		System.out.println("Create new task");
	}
	@Test(priority=2)
	public void deleteTask() {
		System.out.println("Delete new task");
	}
	@AfterTest
	public void cleanUp() {
		System.out.println("logout and close browser");
	}
}
