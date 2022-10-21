package TestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Sample4 {
	int age=29;
	
  @Test
  public void c_compose() {
	  System.out.println("iam compose method");
  }
  @Test
  public void a_login() {
	  System.out.println("iam login method");
	  System.out.println("the value of age= "+age);
  }
  @Test
  public void d_signup() {
	  System.out.println("i am signup method");
  }
}
