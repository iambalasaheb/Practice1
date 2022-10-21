package Practiceprogram;

public class Practice4 {
static int empid=12345;
double sallary;
public static void main(String[]args) {
	int age=28;
	System.out.println("program starts");
	System.out.println("given value of age="+age);
	System.out.println("given value of empid="+empid);
	//to access non static global by creating object
Practice4 r1=new Practice4();
System.out.println("given value of sallary="+r1.sallary);
//we can update value of sallary
r1.sallary=97000;
System.out.println("given value of sallary="+r1.sallary);
//we can create one more object to update value of NGV
Practice4 r2=new Practice4();
System.out.println("given value of sallary="+r2.sallary);
//due to cration of 2nd object we can get sallary initial value i.e 25000 
empid=11111;
System.out.println("updated value of empid="+empid);
}

}
