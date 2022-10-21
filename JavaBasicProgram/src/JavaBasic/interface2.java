package JavaBasic;


interface Animal0{
	int age=20;
	public void animalsound();
	public void sleep();
}
class Pig7 implements Animal0{
	public void animalsound() {
		System.out.println("the pig says wee wee");
	}
	public void sleep() {
		System.out.println("Zzzzz");
	}
}
public class interface2 {
public static void main(String[] args) {
	Pig7 a1=new Pig7();
	System.out.println("the value of age="+Animal0.age);
	a1.animalsound();
	a1.sleep();
	System.out.println("++++++++++++++++++++++++++++++++++++++");
	Animal0 a2=new Pig7();
	a2.animalsound();
	a2.sleep();
}
}