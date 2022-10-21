package Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotation1 {
	
  @BeforeTest
  public void Setup() {
	  System.out.println("iam setup method");
  }
  @Test
  public void Createtask() {
	  System.out.println("iam create task method");
  }
  @AfterTest
  public void Cleanup() {
	  System.out.println("iam cleanup method");
  }
}
