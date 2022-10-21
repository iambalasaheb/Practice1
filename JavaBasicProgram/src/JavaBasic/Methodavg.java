package JavaBasic;

public class Methodavg {
//static global variables
	static int age;
	static double salary;
	public static int test1() {
int pincode=12345;
System.out.println("pincode="+pincode);

return pincode;
	}
	static void test2() {
		int age=25;
		double salary=25000;
		System.out.println("age="+age);
		System.out.println("salary="+salary);

	}
	public static double test3() {
		int year=23; 
		int payment=20000;
		int result= year+payment;
		System.out.println("age="+year);
		System.out.println("age="+payment);
	System.out.println("program starts="+result);
    return result ;
		
	} 
	public static void main(String[] args) {
		Methodavg.test2();
		System.out.println("****************************");
        Methodavg.test3();
        System.out.println("********************************");
        Methodavg.test1();


	}

}
