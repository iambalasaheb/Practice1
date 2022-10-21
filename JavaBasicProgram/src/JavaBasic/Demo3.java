package JavaBasic;

public class Demo3 {
	static double simpleinterest(double a, double r, int t) {
	double interest=a*r*t;
	System.out.println("the value of a="+a );
	System.out.println("the value of b="+r);
	System.out.println("time required in year"+t);
		System.out.println("the amount of interst="+interest);
		return interest;
	}
	public static void main(String[] args) {
		System.out.println("program starts");
		System.out.println("the amount of interst="+Demo3.simpleinterest(5000,2.5,2));
		System.out.println("***********************************");
		Demo3.simpleinterest(50000, 5.5, 5);


		


	}

}
