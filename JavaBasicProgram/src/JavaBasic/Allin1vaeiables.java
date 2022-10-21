package JavaBasic;

public class Allin1vaeiables {
	//global variable
		static int empId=10;//static global variable
		double salary;//non-static global variable
		public static void main(String[] args) {
			System.out.println("Programs starts");
			//local variables
			int age=25;
			System.out.println("age: "+age);
			System.out.println("*****************Accessing static members*********************");
			System.out.println("initial Static GV empID: "+empId);
			Allin1vaeiables.empId=101;
			System.out.println("updated Static GV empID: "+empId);
			System.out.println("*****************Accessing non-static members*********************");
//				AllinOneVariables r2;//no object creation
//				r2=new AllinOneVariables();// object created
			
			Allin1vaeiables r1=new Allin1vaeiables();
			System.out.println("initial NSGV salary: "+r1.salary);
			r1.salary=95000;
			System.out.println("updated NSGV salary: "+r1.salary);
			
			System.out.println("****************new instance of the class*************************");
			Allin1vaeiables r2=new Allin1vaeiables();
			System.out.println("initial NSGV salary: "+r2.salary);
			System.out.println("*******************************************************************");
			 double salary=45000;
			System.out.println("updated Static GV empID: "+empId);
			System.out.println("sallary="+salary);

	}

}
