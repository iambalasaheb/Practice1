package ParelleleExecution;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ParallelExecutionForMethod {
  @Test
  public void TestCase1() {
	  /*printing id of the thread on using which test method got executed */
	  System.out.println("test case 1 with thread id: "+Thread.currentThread().getId());
  }
  @Test
  public void TestCase2() {
	  /*printing id of the thread on using which test method got executed */
System.out.println("test case 2 with thread id: "+Thread.currentThread().getId());
  }
}
