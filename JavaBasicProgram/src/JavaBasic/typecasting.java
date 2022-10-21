package JavaBasic;
class JD {
	public void printMe1() {
		System.out.println("JournalDev print method");
	}
	void disp() {
		System.out.println("JournalDev disp method");
	}
}
//Inherited class
class Java extends JD {
	public void printMe2() {
		System.out.println("Java print method");
	}
	void disp() {
		System.out.println("Java disp method");
	}
}
//Inherited class
class Android extends Java {
	public void printMe3() {
		System.out.println("Android print method");
	}
	void disp() {
		System.out.println("Android disp method");
	}
}
public class typecasting {
	public static void main(String[] args) {
JD a=new Android();//upcasting of object creating of subclass and reference by super class
a.printMe1();
System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
Android a1=(Android)a;//explicit downcasting of referance of supper class to object of subclass
a1.disp();
a1.printMe3();
a1.printMe2();
a1.printMe1();
System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
Java a2=(Java)a;//explicit downcasting of java class by referance to supper class
a2.disp();
//a2.printMe3();
a2.printMe2();
a2.printMe1();


	}

}
