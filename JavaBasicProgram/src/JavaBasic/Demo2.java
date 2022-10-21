package JavaBasic;

public class Demo2 {
		
     static int sample(int a, int b){
	 System.out.println("running a sample method");
	 System.out.println("value of a="+a);
	 System.out.println("value of b="+b);
	 int sum=a+b;
	 return sum;
     }
	 public static void main(String[] args) {
		 System.out.println("program starts=");
		 int res= sample(12,34);
		 System.out.println("res="+res);
		 System.out.println("**********************");
		 int res1= sample(23,64);
		 System.out.println("res="+res1);
		 System.out.println("program ends");

}
}
