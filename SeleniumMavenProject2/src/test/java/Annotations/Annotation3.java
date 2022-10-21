package Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation3 {
	
  @Test(priority=1)
  public void taskcreation() {
	  System.out.println("iam task creation method");
  }
  @Test(priority=2)
  public void deletetask() {
	  System.out.println("iam task delete method");
  }
  @BeforeMethod
  public void logout() {
	  System.out.println("iam logout method");
  }
  @AfterMethod
  public void Login() {
	  System.out.println("iam Login method");
  }
}
