package Assignments;
import java.util.Scanner;
public class scannerclass {

	public static void main(String[] args) {
int age;
double salary;
String name;
boolean valid;
//object creation of scanner class
Scanner a=new Scanner(System.in);
//initialization of variables using scanner class
System.out.println("enter the value of age from console");
age=a.nextInt();
System.out.println("enter the value of salary from console");
salary=a.nextDouble();
System.out.println("enter the value of string name from console");
name=a.next();
System.out.println("enter the value of valid boolean from console");
valid=a.nextBoolean();
System.out.println("age= "+age);
System.out.println("salary= "+salary);
System.out.println("name= "+name);
System.out.println("valid= "+valid);
int num1,num2;
num1=a.nextInt();
System.out.println("enter num1 ");
num2=a.nextInt();
System.out.println("enter num2 ");
char op;
System.out.println("enter operatar ");
op=a.next().charAt(0);
System.out.println("Addition of two numbers: " + addNumber(op, 500, 500));
	}
static int addNumber(char op, int num1, int num2) {
	if (op == '+') {
		return num1 + num2;
	} else {
		return 0;
	}
	}

}
