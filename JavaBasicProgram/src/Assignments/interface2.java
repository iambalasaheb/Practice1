package Assignments;

interface Animal10{
	int age=20;
	void animalsound();
	void sleep();
}
interface Reptile{
	void colour();
}
class Pig10 implements Animal10{
	public void animalsound() {
		System.out.println("i am Pig10 animal sound method");
	}
	public void sleep() {
		System.out.println("i am sleep method");
	}
}
class Pig11 extends Pig10 implements Reptile{
	public void animalsound() {
		System.out.println("i am Pig 11 animal sound method");
	}
	public void colour() {
		System.out.println("i am colour method");
	}
}
public class interface2 {

	public static void main(String[] args) {
		Pig10 a1=new Pig11();
		a1.animalsound();
		a1.sleep();
		System.out.println("++++++++++++++++++++++++++++++++++++++");
        Pig11 a2=new Pig11();
        a2.animalsound();
		a2.sleep();
        a2.colour();	
		System.out.println("++++++++++++++++++++++++++++++++++++++");
       Animal10 a3=new Pig10();
       a3.animalsound();
	   a3.sleep();
       //a3.colour();//not acessible becouse it is undefined in animal class or not available in superclass
}

}
