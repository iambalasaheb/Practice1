package Practiceprogram;
class A {
	static int a=20;
	int b=25;
	double c=50.5;
	
}
class B extends A{
	static int e=38;
	int f=83;
	double g=48;
}
class C extends B{
	static int x=33;
	int y=22;
	double z=400;
}
public class Inheritance1 {

	public static void main(String[] args) {
System.out.println("program starts");
//to access all static members from above diferent class
System.out.println("the value of a feom classA="+A.a);
System.out.println("the value of e from classB="+B.e);
System.out.println("the value of x from classC="+C.x);
System.out.println("+++++++++++++++++++++++++++++++++++");
//to create object to access all nonstatic global variables from all classes by using inheritance
C a1=new C();//becouse of inheritance all classes are linked together and we can acess all
//all nonstatic variables from class C,B & A
System.out.println("the value of z from classC="+a1.z);
System.out.println("the value of y from classC="+a1.y);
System.out.println("the value of g from classB="+a1.g);
System.out.println("the value of f from classB="+a1.f);
System.out.println("the value of c from classA="+a1.c);
System.out.println("the value of b from classA="+a1.b);
System.out.println("+++++++++++++++++++++++++++++++++++");
//now to create abject for class B 
B a2=new B();
System.out.println("the value of g from classB="+a2.g);
System.out.println("the value of f from classB="+a2.f);
System.out.println("the value of c from classA="+a2.c);
System.out.println("the value of b from classA="+a2.b);
System.out.println("program Ends");

	}

}
