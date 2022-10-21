package TestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Exeptiontimeout {
	/*
	 * when u catch the exception at test case level
	 */
  @Test(expectedExceptions=ArithmeticException.class)
  public void dividebyzero() {
	  System.out.println("exception test");
	  int i=10/0;
	  System.out.println("exception is handelled");

  }
  @Test(timeOut=1000)//specify time in millisecond
  public void executetimeout() throws InterruptedException {
	  System.out.println("iam excutetimeout method");
	 // Thread.sleep(2000);
	  //Thread.sleep(500);
  }
}
