package Practiceprogram;

class Fruit{
	Fruit(){
		System.out.println("hello iam fruit constructor");
	}
	public void Test(){
		System.out.println("hello iam test method");
	}
}
class Apple extends Fruit{
	Apple(){
		System.out.println("hello iam Apple constructor");
	}
	public void Shape() {
		System.out.println("hello iam shape method");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		System.out.println("program starts");
//need to create object for accessing nonstatic method
		Apple x=new Apple();//object of child class
		//calling method
		x.Shape();//method of child class
		x.Test();//method of parent class
		System.out.println("program Ends");
	}

}
