package TestparellelClass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Parellelexecutionofmethod {
  @Test
  public void Testcaseone() {
		//Printing Id of the thread on using which test method got executed
	  System.out.println("test case one with thread id");
	  Thread.currentThread().getId();
  }
  @Test
  public void Testcasetwo() {
		//Printing Id of the thread on using which test method got executed
	  System.out.println("test case two with thread id");
	  Thread.currentThread().getId();
  }
}
