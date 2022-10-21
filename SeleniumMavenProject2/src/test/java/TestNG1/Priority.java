package TestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Priority {
	
  @Test(priority=1,description="open browser and enter url")
  public void openbrowser() {
	 System.out.println("iam openbrowser method"); 
  }
  @Test(priority=2)
  public void login() {
	 System.out.println("iam login method"); 
  }
  @Test(priority=3)
  public void createtask() {
	  System.out.println("iam createtask method");	  
  }
  @Test(priority=4)
  public void logout() {
	System.out.println("iam logout method");  
  }
}
