package Practiceprogram;

public class thisstatement3 {

		//global variable
		int age=30;
		double salary=25000;
		//method
		void display() {
			System.out.println("iam display method");
			//this.display(90);//u can call method this way also 
		}
		//method overloading 
		void display(int age) {
			System.out.println("iam parameterised display local age"+age);
			System.out.println("iam parameterised display NSGV age"+this.age);
			//using this keyword to diferanceate nonstatic global and local variable
			System.out.println("iam parameterised display method");
			this.display();//using this keyword to call method of current class
		}		
		//constructor
		thisstatement3() {
			this(23,56000);//using this statement to call constructor and it should be first statement
			System.out.println("iam constructor");
		}
		//constructor overloading
		thisstatement3(int age, double salary) {
			//this();//u can call this constructor also
			System.out.println("iam parameterised constructor");
			System.out.println("iam parameterised constructor local age"+age);
			System.out.println("iam parameterised constructor local age"+age);
			System.out.println("iam parameterised constructor local sallary"+salary);
		}
		//this keyword
	final int call=40;//using final word to declared variable constant
		public static void main(String[] args) {
			System.out.println("program starts");
			thisstatement3 a1=new thisstatement3();
			System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
			System.out.println("the value of final NSGV call"+a1.call);
			System.out.println("the value of NSGV age"+a1.age);
			System.out.println("the value of NSGV salary"+a1.salary);
			System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
			a1.display();
            a1.display(10);
			System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
			thisstatement3 a2=new thisstatement3(40,35000.99);
            a2.display();
			System.out.println("Bye");
		}
	
	}


