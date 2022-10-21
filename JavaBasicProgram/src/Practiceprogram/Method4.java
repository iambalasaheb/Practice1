package Practiceprogram;

public class Method4 {
static double x=4,y=6,z=5;

	public static void main(String[] args) {
System.out.println("the value of x="+x);
System.out.println("the value of y="+y);
System.out.println("the value of z="+z);
System.out.println("the value of avarege1="+average1(x,y,z));
System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("the value of avarege1="+average1(10,20,30));
System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

System.out.println("The average1 value is " + average1(25, 65, 80));
System.out.println("The average1 value is " + average1(40, 65, 70));
System.out.println("The average1 value is " + average1(55, 95, 80));


	}
public static double average1(double p,double q,double r) {
	return (p+q+r)/3;
}
}
