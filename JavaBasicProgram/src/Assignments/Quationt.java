package Assignments;

public class Quationt {
static double Quationt1() {
	double n1=25, n2=7;
	double result=n1/n2;
	System.out.println("quetiont of n1 & n2="+result); 
	//calculating modulus
	double result1=n1%n2;
	System.out.println("modulus of n1 & n2="+result1); 
	return result;
}

	public static void main(String[] args) {
		// calling from direct method
Quationt1();
//calling from class
Quationt.Quationt1();

	}

}
