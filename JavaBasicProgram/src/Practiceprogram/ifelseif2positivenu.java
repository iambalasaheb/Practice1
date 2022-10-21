package Practiceprogram;

public class ifelseif2positivenu {

	public static void main(String[] args) {
int num=-10;//passing any values in num variable
if(num>0) {
	 System.out.println("positive number");
}else if(num<0) {
	 System.out.println("negative number");
}else{
	 System.out.println("zero number");
}
System.out.println("+++++++++++++++++++++++++++++++++");
pos_negative(-1.6);//remember execution always happen in main method so
//method call must be in main method
	}
	//by using method and passing parameters
	static void pos_negative(double a) {
		if(a>0) {
			 System.out.println("positive number");
		}else if(a<0) {
			 System.out.println("negative number");
		}else{
			 System.out.println("zero number");
		}
		}
	}
