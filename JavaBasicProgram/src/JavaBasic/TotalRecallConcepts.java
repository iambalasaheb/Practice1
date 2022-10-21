package JavaBasic;

public class TotalRecallConcepts {
	static int age1;
	static double salary1 = 2536.0326;
	int age2;
	double salary2 = 568.898;
	// method---> static and non-static method
	void display() {
		System.out.println("iam void displya method");
	}
	
	double getInterest(int amount, int numOfYrs, double irt) {
		double result=(amount*numOfYrs*irt)/100;
	return result;
	}
	
	static void display2() {
		System.out.println("iam void displya2 method");
	}
	
	static double getInterest2(int amount, int numOfYrs, double irt) {
		double result1=(amount*numOfYrs*irt)/100;
		return result1;
	}
	
	public static void main(String[] args) {
		System.out.println("the value of static age="+age1);
		System.out.println("the value of age="+salary1);
		System.out.println("+++++++++++++++++++++++++++++++++");
		TotalRecallConcepts a1=new TotalRecallConcepts();
		System.out.println("the value of non static age="+a1.age2);
		System.out.println("the value of non static salary="+a1.salary2);
		System.out.println("+++++++++++++++++++++++++++++++++");
		display2();
		System.out.println("the value of static getroi="+getInterest2(50000,2,6.7));
		//getInterest2(50000,2,6.7);
		//without println calling faild becouse there is no single statement in println
		System.out.println("+++++++++++++++++++++++++++++++++");
        a1.display();
		System.out.println("the value of non-static getroi="+a1.getInterest(20000,1,5.7));
       //a1.getInterest(20000,1,5.7);
		//without println calling faild becouse there is no single statement in println

	}

}
