package Exceptionhandaling;

public class exception6 {

	public static void main(String[] args) {
		System.out.println("program starts here");
try {
	int a=30/0;
	//below code do not throw any exception
	System.out.println("the value of a= "+a);
}
catch(ArrayIndexOutOfBoundsException e) {
	//catch wont be executed
	System.out.println("ArrayIndexOutOfBoundsException= "+e);
}
finally {
	System.out.println("i am finally block here");
}
System.out.println("rest of the code contineuee....");

	}

}
