package JavaBasic;
class Simpleintrest7
{

	public static void main(String[] args) 
	{
		System.out.println("How to find out the simple interest?");
		//syntax to declere and initialized variables =value i.e for simple intrest having formula =A=p(1+rt);
		//A-final amount, p- initial principal balance, r-annual interest rate& t-time in year. values given i.e a=10000,r=0.15 t=2years;

		short p=10000;
		double r=0.15, t=2;
		double resultA=p*(1+r*t);
		System.out.println("simple interest="+resultA);

	}
}
