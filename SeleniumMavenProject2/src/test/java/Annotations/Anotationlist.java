package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotationlist {
  @BeforeSuite
  public void f1() {
	  System.out.println("f1 method");
  }
  @BeforeTest
  public void f2() {
	  System.out.println("f2 method");
  }
  @BeforeClass
  public void f3() {
	  System.out.println("f3 method");
  }
  @BeforeMethod
  public void f4() {
	  System.out.println("f4 method");
  }
  @Test
  public void f5() {
	  System.out.println("f5 method");
  }
  @AfterMethod
  public void f9() {
	  System.out.println("f9 method");
  }
  @AfterTest
  public void f7() {
	  System.out.println("f7 method");
  }
  @AfterClass
  public void f8() {
	  System.out.println("f8 method");
  }
 
  @AfterSuite
  public void f6() {
	  System.out.println("f6 method");
  }  
}
