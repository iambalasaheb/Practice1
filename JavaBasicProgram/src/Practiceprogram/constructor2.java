package Practiceprogram;

public class constructor2 {
	constructor2() {
		System.out.print("Zero Parameterized Constructor");
		System.out.println(" having no parameters");
	}
	constructor2(int a) {
		System.out.print("Parameterized Constructor");
		System.out.println("int type constructor varibale a ="+a);
	}
	constructor2(double b) {
		System.out.print("Parameterized Constructor");
		System.out.println("double type constructor varibale="+b);
	}
	constructor2(int a, double b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" type constructor varibale="+a);
		System.out.println(" type constructor varibale="+b);
		System.out.println(" type constructor varibale="+c);
	}	
	constructor2(double a, int b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println("type constructor varibale="+a);
		System.out.println(" type constructor varibale="+b);
		System.out.println(" type constructor varibale="+c);
	}
	public static void main(String args[]) {
		constructor2 pc5 = new constructor2();
		System.out.println("+++++++++++++++++++++++++++++++++++");
		constructor2 pc1 = new constructor2(12);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		constructor2 pc2 = new constructor2(13.34);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		constructor2 pc3 = new constructor2(10,13.34,45);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		constructor2 pc4 = new constructor2(13.34,23,87);

	}

}
