package JavaBasic;

class A {
	void test1() {
		System.out.println("Running test1()");
	}
}
class B extends A {
	void test2() {
		System.out.println("Running test2()");
	}
}
class Z extends B {
	void test3() {
		System.out.println("Running test3()");
	}
}
public class typecasting1 {

	public static void main(String[] args) {
		Z a1=new Z();//implicit upcasting  referane of child and object of child
		a1.test1();
		a1.test2();
		a1.test3();
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
       // B a2=a1; or B a2=new C;//implicite upcasting 
		//or
		B a2=(B)a1;//explicit upcasting
        a2.test1();
		a2.test2();
		//a2.test3();
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
		A a3=a1;// implicit upcasting
		a3.test1();
		//a3.test2();
		//a2.test3();

	}

}
