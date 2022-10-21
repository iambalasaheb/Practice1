package Practiceprogram;

public class thiskeyword2 {
	int variable = 5;	
	int age=10;
	public static void main(String args[]) {
		thiskeyword2 obj = new thiskeyword2();
		obj.method(20);
		obj.method();	
		System.out.println("obj GV variable: "+obj.variable);//20 becouse no instance created so iy shows updated value
		thiskeyword2 obj2 = new thiskeyword2();
		System.out.println("obj2 GV variable: "+obj2.variable);//5 bec. new instance created 
	}
	void method(int variable) {
		System.out.println("Value of variable :" + variable);//20
		System.out.println("GV Value of variable :" + this.variable);//5
		this.variable=variable;
		System.out.println("Value of variable :" + variable);//20
		System.out.println("GV Value of variable :" + this.variable);//20
	}
	void method() {
		int variable = 40;
		System.out.println("Value of variable :" + variable);
	}

	}

