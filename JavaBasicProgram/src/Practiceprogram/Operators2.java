package Practiceprogram;

public class Operators2 {

	public static void main(String[] args) {
		// Variables Definition and Initialization
				int num1 = 15, num2 = 51;
				System.out.println("num1: " + num1 + "--->num2: " + num2);// 12 12
				// is equal to
				boolean res = (num1 == num2);
				System.out.println("num1 == num2 = " + res);// false
						//or
				System.out.println("num1 == num2 = " + (num1 == num2));// T F F
				// is not equal to
				System.out.println("num1 != num2 = " + (num1 != num2));// F T T
				// Greater than
				System.out.println("num1 >  num2 = " + (num1 > num2));// F T F
				// Less than
				System.out.println("num1 <  num2 = " + (num1 < num2));// F F T
				// Greater than or equal to
				System.out.println("num1 >= num2 = " + (num1 >= num2));// T T F
				// Less than or equal to
				System.out.println("num1 <= num2 = " + (num1 <= num2));// T F T
			
	}

}
