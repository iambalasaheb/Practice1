package JavaBasic;
class grandfather{
	grandfather(){
		System.out.println("i am grandfather constructor");
	}
	void myhome() {
		System.out.println("i am home method");
	}
}
class father extends grandfather{
	father(double a){
		System.out.println("i am father constructor");
		System.out.println("i am father constructor " + a);

	}
	void mycar() {
		System.out.println("i am mycar method");
	}
}
class child extends father{
	child (int a){
		super(12.5);
		System.out.println("i am child constructor");
		System.out.println("i am child constructor " + a);

	}
	void mybike() {
		System.out.println("i am mybike method");
	}
}

public class inheritance2 {

	public static void main(String[] args) {
child a1=new child(50);
a1.myhome();
a1.mycar();
a1.mybike();
System.out.println("++++++++++++++++++++++++++++++++++++++++");
father a4=new father(3.98);//by creating object for father referance by father n its not calling child constructor
a4.myhome();
a4.mycar();
System.out.println("++++++++++++++++++++++++++++++++++++++++");
father a2=new child(30);//by creating object for child referance by father n its calling child constructor
a2.myhome();
a2.mycar();
System.out.println("++++++++++++++++++++++++++++++++++++++++");
grandfather a3= new child(60);//by creating object for child referance by grandfather
a3.myhome();








	}

}
