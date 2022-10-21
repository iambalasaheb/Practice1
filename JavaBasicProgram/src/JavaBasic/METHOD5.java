package JavaBasic;

public class METHOD5 {
public static double average(){
	int a=10,b=20,c=30;
	double result=(a+b+c)/3;
	//System.out.println("the value of a="+a);
	System.out.println("the value of b="+b);
	System.out.println("the value of c="+c);
	System.out.println("the value of avarage="+result);
return result;
}
static void average1(int a,int b,int c) {
	double result=(a+b+c)/3;
	System.out.println("the value of a="+a);
	System.out.println("the value of b="+b);
	System.out.println("the value of c="+c);
	System.out.println("the value of avarage="+result);
}
static int addnumber(int x,int y,int z) {
	int res=x+y+z;
	System.out.println("the value of x="+x);
	System.out.println("the value of y="+y);
	System.out.println("the value of z="+z);
return res;
}
static void multiplication(int a,int b) {
	double res1=a*b;
	System.out.println("the value of a="+a);
	System.out.println("the value of b="+b);
	System.out.println("the value of multiplication="+res1);
	
}
static void modulus(int a,int b) {
	double res2=a%b;
	System.out.println("the value of a="+a);
	System.out.println("the value of b="+b);
	System.out.println("the value of modulus="+res2);

}
	public static void main(String[] args) {
    average();
	System.out.println("+++++++++++++++++++++++++++++++++");
	average1(20,50,70);
	System.out.println("+++++++++++++++++++++++++++++++++");
	addnumber(10,60,44);
	System.out.println("+++++++++++++++++++++++++++++++++");
	multiplication(20,50);
	System.out.println("+++++++++++++++++++++++++++++++++");
	modulus(500,372);
	}

}
