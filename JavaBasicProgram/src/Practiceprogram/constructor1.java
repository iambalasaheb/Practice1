package Practiceprogram;
class cons1{
	int age;
	double salary;
	cons1(){
		System.out.println("iam cons1 class constructor ");
age=21;
salary=40000.0;
	}
}
public class constructor1 {

	public static void main(String[] args) {
cons1 a1=new cons1();
System.out.println("Class C global varibale i = "+a1.age);
System.out.println("Class C global varibale i = "+a1.salary);

	}

}
