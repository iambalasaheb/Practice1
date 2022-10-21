package JavaBasic;

class company{
	void display() {
		System.out.println("i am company display method");
	}
	void callme(){
		System.out.println("i am company callme method");

	}
}
class employee extends company{
	void display() {
		super.display();
		System.out.println("i am employee display method");
	}
	void callme(){
		System.out.println("i am callme method");

	}
}
public class inheritance3 {

	public static void main(String[] args) {
employee a1=new employee();
a1.display();
a1.callme();
System.out.println("++++++++++++++++++++++++++++++++++++++++");
company a2=new company();
a2.display();
System.out.println("++++++++++++++++++++++++++++++++++++++++");
company a3=new employee();
a3.display();
a3.callme();


	}

}
