package mock;

public class fibonacciseries {
	
	
	
	public static void fibonaci(int a,int b,int c) {
	      System.out.print(a+" "+b);
	      for(int i=2;i<=15;i++) {
	    	  c=a+b;
	    	  System.out.print(" "+c);
	    	  a=b;
	    	  b=c;
	}
	}
	public static void main(String[] args) {
//      int a=1, b=2;
//      int c;
//      System.out.print(a+" "+b);
//      for(int i=2;i<=15;i++) {
//    	  c=a+b;
//    	  System.out.print(" "+c);
//    	  a=b;
//    	  b=c;
//      }
		fibonaci(1,2,0);
	}
	}