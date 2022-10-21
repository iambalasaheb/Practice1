package JavaBasic;

public class Method3 {

	/**
	 * simple interest: roi = (p*r*t)/100;
	 * @param args
	 */
	static void getROI() {
		int p=45000,t=2;
		float r=6.5f;
		double roi=(p*r*t)/100;
		System.out.println("Principle amount is: "+p);
		System.out.println("ROI is: "+r);
		System.out.println("Duration is: "+t);
		System.out.println("Interest paid by you: "+roi);
	}
	static double getROI(int p,int t,float r) {
		double roi=(p*r*t)/100;
		System.out.println("Principle amount is: "+p);
		System.out.println("ROI is: "+r);
		System.out.println("Duration is: "+t);
		System.out.println("Interest paid by you: "+roi);
		return roi;
	}
	public static void main(String[] args) 
	{
		System.out.println("Programs Starts");
		getROI();
		System.out.println("************Using parameter*******************");
System.out.println("value="+getROI(35000, 3, 5.5f));		
		int amount=55000;
		System.out.println("***************************************");
		double interest=getROI(amount, 5, 4.5f);
		double finalAmout=amount+interest;
		System.out.println("Total amount paid by you: "+finalAmout);
		System.out.println("Programs Ends");
getROI(40000, 5, 3.5f);
		}

	}

	
