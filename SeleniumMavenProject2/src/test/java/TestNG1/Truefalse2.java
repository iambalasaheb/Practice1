package TestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Truefalse2 {
	
  @Test(enabled=true)
  public void openbrowser() {
	  System.out.println("iam openbrowser method");

  }
  @Test(enabled=false)
  public void login() {
	  System.out.println("iam login method");

  }
  @Test(enabled=true)
  public void createtask() {
	  System.out.println("iam createtask method");

  }
  @Test(enabled=false)
  public void logout() {
	  System.out.println("iam logout method");
  }
}
