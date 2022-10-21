package Exceptionhandaling;

public class exception13 {

//defining a method
		public int divideNum(int m, int n) {
			int div=m/n;
			return div;
		}
		public static void main(String[] args) {
      exception13 a2=new exception13();
      try {
    	  System.out.println("try block start");
    	  System.out.println("result of div "+a2.divideNum(100,0));
    	  System.out.println("try block end");

      }
      catch(ArithmeticException e) {
    	  System.out.println("catch block start");
    	  //System.out.println("Exception handelled "+e);
    	  System.out.println("num cannot be divided by zero");
    	  System.out.println("catch block end");

      }
	  System.out.println("rest of the code");

	}

}
