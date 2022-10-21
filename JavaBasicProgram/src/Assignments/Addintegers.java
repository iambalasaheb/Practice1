package Assignments;

public class Addintegers {
public static int Add1(int num1, int num2) {
	int result=num1+num2;
	System.out.println("addition of 2 numbers="+result);
	
	return result;
}
	public static void main(String[] args) {
		
		System.out.println("program starts");
		//calling method in main directly using method name
		Add1(10,20);
		//calling method in main from another way by using class name
		Addintegers.Add1(100,200);
	}

}
