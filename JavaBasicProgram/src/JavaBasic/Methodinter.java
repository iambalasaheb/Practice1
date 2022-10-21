package JavaBasic;

public class Methodinter {

	static void getroi() {
			
		int p=10000,t=2;
		double r=1.5;
		double roi=(p*r*t)/100;
		System.out.println("principal value of p="+p);
		System.out.println("time required in year="+t);
		System.out.println("rate of interest="+r);
		System.out.println("interest paid by you="+roi);
		}
	public static double getroi(int p, int t,double r) {
		double roi=(p*r*t)/100;
		System.out.println("***********************");
		System.out.println("principal value of p="+p);
		System.out.println("time required in year="+t);
		System.out.println("rate of interest="+r);
		System.out.println("interest paid by you="+roi);
		return roi;
	}
	public static void main(String[] args) {
		getroi();//for void method ok
			System.out.println("****************");
	getroi(50000,1,2.5f);//by using new parameters
	System.out.println("**********************");
	getroi(1000,5,1.7f);
	System.out.println("*************************************");
	int amount=1000;
	double interest=getroi(1000,5,1.7f);
	double finalamount=(amount+interest);
	System.out.println("final amount paid by u="+finalamount);

		
	}

}
