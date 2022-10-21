package TestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Sample1 {
	int age=26;
	void display() {
		System.out.println("i am display method");
	}
  @Test
  public void testcase1() {
	  System.out.println("iam test case1 method");
	  System.out.println("the value of age= "+age);
	  //calling display method
	  display();
  }
}
