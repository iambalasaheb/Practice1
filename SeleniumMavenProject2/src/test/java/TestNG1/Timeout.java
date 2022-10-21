package TestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Timeout {
	
	
  @Test(enabled=true,timeOut=200)
  public void openbrowserandurl () throws InterruptedException {
	  Thread.sleep(180);
	  System.out.println("iam openbrowserandurl method");
  }
}
