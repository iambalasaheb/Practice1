package JavaBasic;

public class Method2 {
	// salary  variable is a static variable
	   static double salary=10000.67;
	   static int empId=1001;   
	   public static int printEmpID(){
		   System.out.println("printEmpID is running..");
		   return 1011;
	   }   
	   public static void printEmpSal(){
		   System.out.println("printEmpSal is running.."+salary);
	   }   
	   public static void main(String args[]) {
		
		   int age=30;
		   //want to print age
		   System.out.println("age: "+age);
		   //want to print salary
		   //System.out.println("salary: "+salary);
		   System.out.println("salary: "+Method2.salary);
		   //want to print empId
		   System.out.println("empId: "+Method2.empId);
		   //want to execute printEmpSal()
		   //printEmpSal();
		   			//or
		   Method2.printEmpSal();
		   //want to execute printEmpID()
		   //Method1.printEmpID();
		   				//or
//		  int id=Method1.printEmpID();  
//		  System.out.println("empId: "+id);
		   					//or
		 System.out.println("empId: "+Method2.printEmpID());	   
	   }
	}