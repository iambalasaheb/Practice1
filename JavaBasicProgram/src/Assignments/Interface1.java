package Assignments;
interface Drawable{
	int salary=23000;
	void draw();
}
class rectangle implements Drawable {
	public void draw() {
	System.out.println("iam rectangle draw method");
	}
	void display() {
		System.out.println("iam rectangle display method");
	}
}
class Circle implements Drawable{
	public void draw() {
		System.out.println("iam circle draw method");
	}
	void display() {
		System.out.println("iam circle display method");
	}

}
public class Interface1 {

	public static void main(String[] args) {
		System.out.println("the value of salary="+Drawable.salary);
    Circle a1=new Circle();
    a1.draw();
    a1.display();
	System.out.println("+++++++++++++++++++++++++++++++++++");
    rectangle a2=new rectangle();
    a2.draw();
    a2.display();
	System.out.println("+++++++++++++++++++++++++++++++++++");
    Drawable a3=new Circle();
    a3.draw();
    //a3.display();

	}

}
