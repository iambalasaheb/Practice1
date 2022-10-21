package Practiceprogram;

public class Practice5 {
	static int empid=1234;
	static double salary=30000;
	public static int printempid () {
		System.out.println("print empid is reunning");
		return empid;
	}
	public static void salary() {
	System.out.println("print salary is reunning");

	}
	public static void main(String[] args) {
		int age=24;
		System.out.println("program starts");
		System.out.println("value of local variable age="+age);
		System.out.println("value of global variable empid ="+empid);
		//calling static global empid by standerd
		System.out.println("value of global variable by standerd empid ="+Practice5.empid);
		System.out.println("value of global variable salary ="+salary);
		//calling static global salary by standerd
		System.out.println("value of global by standerd variable salary ="+Practice5.salary);
		System.out.println("program ends");
        //for calling of static method direct call
		Practice5.printempid();
		Practice5.salary();
		//for calling of static method by using println statement 
		System.out.println("***********************************");
		System.out.println("method calling by println="+Practice5.printempid());
		System.out.println("method calling by println="+Practice5.salary);

	}

}
