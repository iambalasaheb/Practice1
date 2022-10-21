package TestCasesUsingTNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SuitGroup {
  @Test(groups="regression")
  public void Testcase1() {
	  System.out.println("iam testcase1 include in regresion testing");
  }
  @Test(groups="regression")
  public void Testcase2() {
	  System.out.println("iam testcase2 include in regresion testing");
  }
  @Test(groups="Smook Test")
  public void Testcase3() {
	  System.out.println("iam testcase3 include in smoketest testing");
  }
  @Test(groups="regression")
  public void Testcase4() {
	  System.out.println("iam testcase4 include in regresion testing");
  }
  @Test(groups="Smoke Test")
  public void Testcase5() {
	  System.out.println("iam testcase5 include in smoketest testing");
  }
}
