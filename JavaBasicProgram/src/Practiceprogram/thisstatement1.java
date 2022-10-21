package Practiceprogram;

public class thisstatement1 {
		thisstatement1() {	
			this(25.36);
			System.out.println("hello zero");
		}
		thisstatement1(double d) {
			this(15);
			System.out.println("hello double " + d);
		}
		thisstatement1(int x) {
			System.out.println("Hello int " + x);
		}
	
		public static void main(String args[]) {
			 thisstatement1 a1=new thisstatement1();
			 System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
			 thisstatement1 a2=new thisstatement1(10);
			 System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
			 thisstatement1 a3=new thisstatement1(10.23);
			 System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
				//or
			 thisstatement1 a = new thisstatement1();
		}
	

	/**
	 * this()---> statement
	 * this(): used to call another constructor of current class based on its argument
	 * this(): should be the first statement inside the constructor body
	 */
	}


