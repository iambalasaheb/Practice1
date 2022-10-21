package JavaBasic;

public class Constructoroverloding {
		int age;
		double salary;
		Constructoroverloding() {
			System.out.println("============Zero- Parameterized Constructor started============");
			System.out.println(" having no parameters");
			System.out.println("============Zero- Parameterized Constructor Ends....============");	
		}	
		Constructoroverloding(int a) {
			System.out.println("============int Parameterized Constructor started============");
			System.out.println(" having int parameters");
			age=a;
			System.out.println("============int Parameterized Constructor Ends....============");
		}
		Constructoroverloding(double b) {
			System.out.println("============double Parameterized Constructor============");
			System.out.println(" having double parameters");
			salary=b;
			System.out.println("============double- Parameterized Constructor Ends....============");
		}
		Constructoroverloding(int a, double b) {
			System.out.println("============int-double Parameterized Constructor started============");
			System.out.println(" having int-double parameters");
			age=a;
			salary=b;
			System.out.println("============int-double Parameterized Constructor Ends....============");
		}

		public static void main(String args[]) {
			Constructoroverloding pc1 = new Constructoroverloding();
			System.out.println("After Zero-para constructor,Age= "+pc1.age);//0
			System.out.println("After Zero-para constructor,Salary= "+pc1.salary);//0.0		
			
			Constructoroverloding pc2 = new Constructoroverloding(33);
			System.out.println("After int-para constructor,Age= "+pc2.age);//33
			System.out.println("After int-para constructor,Salary= "+pc2.salary);//0.0
			
			Constructoroverloding pc3 = new Constructoroverloding(34000.34);
			System.out.println("After double-para constructor,Age= "+pc3.age);//0
			System.out.println("After double-para constructor,Salary= "+pc3.salary);//34000.34
			
			Constructoroverloding pc4 = new Constructoroverloding(30,95000.34);
			System.out.println("After int-double-para constructor,Age= "+pc4.age);//30
			System.out.println("After int-double-para constructor,Salary= "+pc4.salary);//95000.34
		}
	}
	/**
	 * by using concept of  constructor overloading we can initialize every object/instance with different values
	 * 
	 */ 