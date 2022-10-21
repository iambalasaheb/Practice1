package Practiceprogram;

public class thiskeyword {
static int age=20;
int empid=12345;
void display() {
	int empid=5678;
	System.out.println("the display local empid "+empid);
	System.out.println("the display local empid "+this.empid);
}
	public static void main(String[] args) {
int age=30;
System.out.println("the local variable of main method age "+age);
System.out.println("the variable of static age "+thiskeyword.age);
System.out.println("+++++++++++++++++++++++++++++++++++");
thiskeyword a1=new thiskeyword();
System.out.println("the nsgv of empid "+a1.empid);
a1.display();

	}

}
