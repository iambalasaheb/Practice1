package Exceptionhandaling;

public class exception5 {

	public static void main(String[] args) {
try {
		int []a=new int[5];
   a[5]=20/0;
	}catch(Exception e){
	System.out.println("Exception class"+e);	
	}
//catch(ArithmeticException e){
//		System.out.println("ArithmeticException"+e);	
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("ArrayIndexOutOfBoundsException "+e);	
//		}
	}
}
/**
* unreachable code: a block of code which never executes by JVM
*
*/