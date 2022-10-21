package Assignments;

abstract class Abs {
		int age;
			Abs(){
				System.out.println("i am abs1 constructor ");
			}
		abstract void time();
		void display() {
				System.out.println("i am abs1 display method ");
			}
	}
abstract class Abs1 {
		abstract void call1();
		abstract void call2();
	     void time(){
			System.out.println("i am abs1 time method");
		}
		void display1() {
			System.out.println("i am abs1 display1 method");
		}
	}
abstract class Abs2 {
		abstract void call1();
		abstract void call2();
	}
abstract class Abs3 {
		
		void display1() {
			System.out.println("i am abs3 display1 method");
		}
	}
public class Abstraction1 extends Abs2{
	
   void call1(){
	System.out.println("i ama bstraction class call1 method");
}
   void call2(){
	System.out.println("i am abstraction class call2 method");
}
   void call3() {
	   System.out.println("iam call 3 meyhod");
   }
	public static void main(String[] args) {
		Abs2 a1=new Abstraction1();
		a1.call1();
		a1.call2();
		 //a1.call3();
}
}