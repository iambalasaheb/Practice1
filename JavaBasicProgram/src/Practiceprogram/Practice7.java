package Practiceprogram;

public class Practice7 {
public static void addnumber(int num1,int num2) {
	System.out.println("program starts");
	System.out.println("the value of num1="+num1);
	System.out.println("the value of num1="+num2);
	int result=num1+num2;
	System.out.println("the value of result="+result);
	System.out.println("program ends");

}
public static int addnumber1(int num1,int num2){

	System.out.println("program starts");
	System.out.println("the value of num1="+num1);
	System.out.println("the value of num1="+num2);
	int result=num1+num2;
	System.out.println("the value of result="+result);
	System.out.println("program ends");

	return result;
	
}
	public static void main(String[] args) {
//direct method calling becouse of static method int addnumber1 method with passing parrameters
	addnumber1(10,20);
	//calling by using classs name
	Practice7.addnumber1(10,20);
	//or calling in println statement
	System.out.println("the method call result="+	Practice7.addnumber1(10,20));
	//direct method calling becouse of static calling void method by passing parameters
	addnumber(40,50);
	//by using class name
	Practice7.addnumber(40,50);
	//or calling in println statement
	//System.out.println("the method call result="+Practice7.addnumber(40,50));//it shows error becouse it wont return any value
	//to jvm becouse of void

	}

}
