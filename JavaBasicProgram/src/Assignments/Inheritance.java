package Assignments;
class Company{
	int age=10;
	Company(int a){
		System.out.println("i am company constructor ");
		System.out.println("the value of a ="+a); 
	}
	void display() {
		System.out.println("i am company display method");
	}
	void display(int b) {
		int age=34;
		this.display();
		System.out.println("i am company parameter display method ");
		System.out.println("the value of company age= "+age);
		System.out.println("the value of a= "+b);
		System.out.println("the value of company age= "+this.age);
	}
}
class Employee extends Company{
	int age=30;
	Employee(){
		super(20);
		System.out.println("i am employee constructor ");
	}
	void display() {
		System.out.println("i am employee display method ");
	}
	void display(int b, double c) {
		int age=77;
		this.display();
		super.display(100);
		System.out.println("i am employee parameter display method ");
		System.out.println("the value of employee age= "+age);
		System.out.println("the value of a= "+b);
		System.out.println("the value of b= "+c);
		System.out.println("the value of employee age= "+this.age);
		System.out.println("the value of employee age= "+super.age);
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Employee a1=new Employee();
		System.out.println("+++++++++++++++++++++++++++++++++++");
         a1.display(10,20.0);
			}

	}


