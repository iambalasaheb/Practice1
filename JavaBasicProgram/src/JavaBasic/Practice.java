package JavaBasic;

class Practice {
	//global variables ---> static and non-static
		static int age1;
		static double salart1 = 2536.0326;
		int age2;
		double salart2 = 568.898;
		// method---> static and non-static method
		void display() {

		}
		double getInterest(int amount, int numOfYrs, double irt) {

			return 253.5465;
		}
		static void display2() {

		}
		static double getInterest2(int amount, int numOfYrs, double irt) {

			return 253.5465;
		}
		public static void main(String[] args) {
			//local variable
			System.out.println("local variable= "+age1);
			System.out.println("local variable= "+salart1);
			//access static members
			System.out.println(Practice.getInterest2(5000,5,10.5));			
			Practice.display2();
			//Practice.getInterest2(5000,5,10.5);			
			//access non-static members
			Practice a=new Practice();
			System.out.println("global variable= "+a.age2);
			System.out.println("global variable= "+a.salart2);
			a.display();
			System.out.println(a.getInterest(40000, 2, 8.5));			
			//a.getInterest(40000, 2, 8.5);
		}
	}