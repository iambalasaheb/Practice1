package Practiceprogram;

public class Method1 {
static int age;
static double sallary;

public static int Test() {
	int pin=12345;
	System.out.println("I am test method.");
	//System.out.println("value of pin="+pin);
	return pin;  
}
static void Test1() {
	System.out.println("I am test1 method");
}
static double Test2(boolean b) {
	System.out.println("i am test 2 method");
	System.out.println("value of b="+b);

return 10.2;
}
static private void Test3(float f) {
	System.out.println("iam test 3 method");
	System.out.println("value of f="+f);
}
	public static void main(String[] args) {
		System.out.println("program start");
		System.out.println("value of age="+age);
		System.out.println("value of sallary="+sallary);
		System.out.println("***************************");
//calling test method
		Method1.Test();//standerd call
		System.out.println("calling println="+		Method1.Test());
		System.out.println("***************************");
		Method1.Test1();
		//System.out.println("calling void from println="+Method1.Test1()); return type is void
		System.out.println("***************************");
		Method1.Test2(false);
		System.out.println("calling in println="+Method1.Test2(true));
		System.out.println("***************************");
		Method1.Test3(13.3f);
		//System.out.println("calling void in println="+Method1.Test3(12.6f));
		System.out.println("program end");





	}

}
