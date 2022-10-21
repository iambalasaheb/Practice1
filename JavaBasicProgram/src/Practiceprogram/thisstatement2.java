package Practiceprogram;

public class thisstatement2 {

	thisstatement2() {
		this(5);
		System.out.println("hello a");
	}
	thisstatement2(int x) {
		System.out.println(x);
	}

	public static void main(String args[]) {
		thisstatement2 a = new thisstatement2(10);
		//this is indivijual call for parameter constructor
		 System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
		thisstatement2 a1 = new thisstatement2();
		//this output effect is by using this stsement whic calling bothe the constructor
	}
}
/**
 * One constructor calls another constructor of the class called Constructor
 * Chaining
 */

