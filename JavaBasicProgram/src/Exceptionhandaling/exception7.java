package Exceptionhandaling;

public class exception7 {

	public static void main(String[] args) {
  try {
	  System.out.println("try block starts here");
	  //below code throw error divide by zero exception
	  int a=30/5;
	  //System.exit(0);
	  System.out.println("the value in try block"+a);
  }//cannot handelled arithmetic type exception
  //can only accept null pointer exception
  catch(NullPointerException e) {
	  System.out.println("nullpointer exception value= "+e);
  }
//  catch(ArithmeticException e) {
//		System.out.println("arithmetic exception"+e);
//  }
  //executes regardless exception occured or not
  finally {
	  System.out.println("i am inside the finally block");
	 // int k=30/0;
	  System.out.println("finally block statement always executed");

  }	  System.out.println("rest of the code..........");

	}

}
