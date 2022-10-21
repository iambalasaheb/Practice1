package Practiceprogram;

public class thiskeyword1 {
static int age;
double salary;
int empid;
void display(double salary) {
	System.out.println("the local variable of display method salary= "+salary);
	System.out.println("the NSGV of salary ="+this.salary);
this.salary=20000;
System.out.println("the initialization of this salary="+this.salary);
}
	public static void main(String[] args) {
int age=29;
System.out.println("the local of main method of age="+age);
System.out.println("the SGV of age="+thiskeyword1.age);
int empid=25244;
double salary=34333;
System.out.println("the local of main method of empid="+empid);
System.out.println("the local of main method of salary="+salary);
System.out.println("+++++++++++++++++++++++++++++++++++");
thiskeyword1 a1=new thiskeyword1();
System.out.println("the NSGV of empid="+a1.empid);
System.out.println("the NSGV of salary="+a1.salary);
System.out.println("+++++++++++++++++++++++++++++++++++");
a1.display(2222.90);
System.out.println("the NSGV of salary="+a1.salary);
System.out.println("+++++++++++++++++++++++++++++++++++");
thiskeyword1 a2=new thiskeyword1();
System.out.println("the NSGV of empid="+a2.empid);
System.out.println("the NSGV of salary="+a2.salary);
a2.display(45000.99);
	} 
}
	/* this keyword is a predefined keyword in JAVA
	 * this keyword is an instance of current class
	 * this keyword is used to differentiate non-static local and global variable when they have same name
	 * this keyword can be used only for non-static method
	*/


