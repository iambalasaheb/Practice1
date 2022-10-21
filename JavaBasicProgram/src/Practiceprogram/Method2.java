package Practiceprogram;

public class Method2 {
static void display() {
	System.out.println("hello iam display method");
}
static void display(char c) {
	System.out.println("hello iam value of char="+c);

}
static void  display(int num) {
	
	System.out.println("hello iam value of num1="+num);
}
	public static void main(String[] args) {
		System.out.println("program starts");
		//non parametred display method
		Method2.display();//calling by standerd
		System.out.println("***************************");
		display();//calling static directly
        //char type parametr display method
		Method2.display('A');
		System.out.println("***************************");
		display('Z');
		System.out.println("***************************");
		//int type parametr display method
		Method2.display(120);
		System.out.println("***************************");
		display(160);
		System.out.println("program starts");




	}

}
