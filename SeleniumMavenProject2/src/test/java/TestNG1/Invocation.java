package TestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Invocation {
	
  @Test(enabled=true,invocationCount=4)
  public void openbrowser() {
	  System.out.println("iam openbrowser method");
  }
}
