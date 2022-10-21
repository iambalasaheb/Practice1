package Assignments;
class Balasaheb{
	void display(int num) {
	System.out.println("iam balasaheb class display "+num);
	}
 final void display1() { 
	System.out.println("iam balasaheb class final display1 ");

	}
}
public class inheritance2 extends Balasaheb {
/*                                       //we can write final method only once in program it cant be override
	void display1() {                                              
	System.out.println("iam inheritance class display1 ");
super.display1();
}*/
void display(int x) {
	System.out.println("iam inheritance class display "+x);
super.display(30);
}
	public static void main(String[] args) {
		inheritance2 a1=new inheritance2();
		a1.display1();
		a1.display(40);
	}

}
