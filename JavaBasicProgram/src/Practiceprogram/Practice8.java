package Practiceprogram;

public class Practice8 {
static double x=10,y=20,z=30;
	public static void main(String[] args) {
		System.out.println("global static variable x="+x);	
		System.out.println("global static variable y="+y);	
		System.out.println("global static variable z="+z);	
		System.out.println("the average value of non parametr method="+Practice8.Average());	
double res=Practice8.Average();
System.out.println("value of res="+res);
System.out.println("the average value of parametr method="+Practice8.Average(50,50,50));	
Practice8.Average(25,25,25);
System.out.println("+++++++++++++++++++++++++++++++++++++++++");
Practice8.Addition(25.1,25.5);
System.out.println("addition of void a b="+Practice8.Addition(25,25));	


	}
	public static double Average(int a,int b,int c) {
		int res=(a+b+c)/3;
		System.out.println("value of res="+res);
		return res;
		
	}
	public static double Average() {
		return (x+y+z)/3;	
		}
	public static void Addition(double a,double b) {
		double res=a+b;
		System.out.println("addition of void a&b="+res);	
		}
	public static double Addition(long a,int b) {
		double res=a+b;
		System.out.println("addition of double ab="+res);	
		return (a+b);
	}

}
