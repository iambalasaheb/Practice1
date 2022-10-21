package TestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Sample3 {
	double sallary=70000;
  @Test
  public void signup() {
	  System.out.println("iam signup method");
	  System.out.println("the value of sallary= "+sallary);
  }
  @Test
  public void login() {
	  System.out.println("iam login method");
  }
  @Test
  public void compose() {
	  System.out.println("iam compose method");
	  System.out.println("the value of sallary= "+sallary);

  }
}
