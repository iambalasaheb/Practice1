package Exceptionhandaling;
import java.util.Scanner;
public class Exception3 {

	public static void main(String[] args) {
//abnormal statement
		System.out.println("program starts here");
		Scanner scn=new Scanner(System.in);
		System.out.println("define array size here");
       int size=scn.nextInt();
		int[] a=new int[size];	
		try {
			System.out.println(" try block stsrts here");
			System.out.println(a[3]);//arrayoutofboundexception
			System.out.println("u are inside the try block");
			System.out.println("try block ends here");
		}catch(Throwable obj){
			System.out.println("catch block stsrts here");
			System.out.println("exception object"+obj);
			//System.out.println("Exaption detail by printStackTrace: ");
		//	obj.printStackTrace();
		//	System.out.println("With getMessage: "+obj.getMessage());
			System.out.println("catch block stsrts here");
		}

	System.out.println("program ends here");
	}
}