package Exceptionhandaling;

public class exception4 {

	public static void main(String[] args) {
		System.out.println("program starts");
try {
	int[] a=new int[5];
	a[5]=30/0;}
catch(ArithmeticException e) {
	System.out.println("arithmetic exception"+e);
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("arrayout of bound index exception"+e);
}catch(Exception e) {
	System.out.println("by exception"+e);
}
try {	System.out.println("u r in 2nd try block");

	int[] a=new int[5];
	a[5]=30/2;
}catch(ArithmeticException e) {
	System.out.println("arithmetic exception"+e);
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("array out of bound index exception"+e);
}catch(Exception e) {
	System.out.println("by exception"+e);
}	
System.out.println("rest of the code");

	}
}

/**
* try block can have multiple catch block, but only one catch block will be executed 
* try can handle only one abnormal condition at a time
*/