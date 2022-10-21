package Practiceprogram;
class D{
	int i=10;
	D(){
System.out.println("iam C class constructor ");
i=20;
	}
}
public class constructor {
	public static void main(String[] args) {
D a=new D();
System.out.println("Class C global varibale i = "+a.i);
D a1=new D();
System.out.println("Class C global varibale i = "+a1.i);

	}

}
