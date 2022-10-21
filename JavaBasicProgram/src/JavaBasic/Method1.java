package JavaBasic;

public class Method1 {
	public static int addNumber(int num1, int num2) 
	{
	System.out.println("Number1 is :"+num1);
	System.out.println("Number2 is :"+num2);
	int result=num1+num2;
	return result;
	}
	public static void main(String[] args) {
	System.out.println("Result of two number addition: "+addNumber(10, 20));
	int res=addNumber(10, 20);
	int finalValue = res*100;
	System.out.println("final result="+finalValue);
	System.out.println("Result of two number addition: "+addNumber(30, 40));
	System.out.println("Result of two number addition: "+addNumber(50, 50));
	System.out.println("final value: "+finalValue);

	}
	}
		