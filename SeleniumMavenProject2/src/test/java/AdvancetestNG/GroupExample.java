package AdvancetestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupExample {
  @Test(groups="regression")
  public void TestCase1() {
	  System.out.println("iam regression test case1 method");
  }
  @Test(groups="smoke")
  public void TestCase2() {
	  System.out.println("iam smoke test case2 method");
  }
  @Test(groups="regression")
  public void TestCase3() {
	  System.out.println("iam regression test case3 method");
  }
  @Test(groups="regression")
  public void TestCase4() {
	  System.out.println("iam regression test case4 method");
  }
  @Test(groups="smoke")
  public void TestCase5() {
	  System.out.println("iam smoke test case5 method");
  }
}
