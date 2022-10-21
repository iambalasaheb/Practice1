package Exceptionhandaling;
import java.util.Scanner;
public class exception2 {

	public static void main(String[] args) {
		System.out.println("program starts here");
    //abnormal statement
		int i,j,k;
		Scanner a1=new Scanner(System.in);
		System.out.println("enter i value");
		i=a1.nextInt();
		System.out.println("enter j value");
		j=a1.nextInt();
		System.out.println("enter k value");
		k=a1.nextInt();
		System.out.println("value of i"+i);
		System.out.println("value of j"+j);
		System.out.println("value of k"+k);
      try {
	System.out.println("******You are inside try block **********");
	 k=i/j;//arithmetic exception
	System.out.println("enter k1 value "+k);
	System.out.println("******no exception found **********");
}
     catch(ArithmeticException obj){
			System.out.println("*********You are in catch()*********");
			System.out.println("Exception handled: "+obj);//java.lang.ArithmeticException: / by zero
			//obj.printStackTrace();//complete exception detail
			System.out.println("******Exception Handled*******");
}System.out.println("program ends here");

	}

}
/**
1. try ---> throws some exeception -----> catch() has to catch it
2. try ---> throws some exeception -----> catch() donesn't that type of declaration dn jvm will terminate the program execution
3. try ---> doesn't have any exception -----> dn catch block will not be executed
*/
