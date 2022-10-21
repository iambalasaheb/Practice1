package JavaBasic;

public class METHOD6 {
static int x=10,y=20,z=30;
	public static void main(String[] args) {
		System.out.println("the value of x="+x);
		System.out.println("the value of y="+y);
		System.out.println("the value of z="+z);
		System.out.println("the value of average="+Average(x,y,z));
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("the value of average="+Average(30,60,50));

	}
 static double Average(int a,int b,int c ){
	return (a+b+c)/3;
}

}
