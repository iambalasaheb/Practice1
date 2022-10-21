package Practiceprogram;

class Paraconstructor{
		Paraconstructor(int a){
		System.out.println("the value of a="+a);
		}
		void Call(){
		System.out.println("iam parameter Call method");
		}
		}
class Child extends Paraconstructor{
		Child(double b){
		super(25);
		System.out.println("the value of b="+b);

		}
		void Call(){
			System.out.println("iam Child Call method");
		}
		}
public class Mockinheritance {
		public static void main(String [] args){
		Child a3=new Child(50.5);
	}

}

