package TestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Truefalse1 {
	
	
  @Test(enabled=true)
  public void openbrowser() {
	  int i=10/0;
	  System.out.println("i am openbrowser method");
	  
  }
  @Test(enabled=true, dependsOnMethods="openbrowser")
  public void login() {
	  System.out.println("i am login method");
	  
  }
  @Test(enabled=true)
  public void createtask() {
	  System.out.println("i am createtask method");
	  
  }
  @Test(enabled=true)
  public void logout() {
	  System.out.println("i am logout method");
	  
  }
}
