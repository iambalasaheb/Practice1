package Practiceprogram;

public class Method3 {
static double ROI() {
	int p=15000, t=2;
	float r=2.5f;
	double roi=(p*t*r)/100;
	System.out.println("value of principal amount="+p);
	System.out.println("value of time in years="+t);
	System.out.println("value of rate of interest="+r);
	System.out.println("value of total roi="+roi);

return roi;
}
static double ROI(int p,int t, float r) {
	double roi=(p*t*r)/100;
	System.out.println("value of principal amount="+p);
	System.out.println("value of time in years="+t);
	System.out.println("value of rate of interest="+r);
	System.out.println("value of total roi="+roi);
	return roi;
	}

	public static void main(String[] args) {
		System.out.println("program starts");
		//calling without para method by standerd 
		Method3.ROI();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		//calling by direct due to static
		ROI();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        //calling parameter method by standerd call
		Method3.ROI(50000,2,4.5f);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        //direct calling due to static
		Method3.ROI(75000,5,7.9f);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        //calling using println statement for both methods becouse of return type non void
		System.out.println("parameter method calling="+ROI(10000,9,6.5f));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		/* when you want a method to return some value and that value need to be used for further 
		operations dn use any primitive datatype as return type for a method
		*/
		int amount=34000;
		double interest=ROI(amount,5,6.7f);
		double finalamount=amount+interest;
		System.out.println("final amount="+finalamount);
		System.out.println("program ends");

	}

}
