package JavaBasic;

public class Constructor3 {
		int i = 10;
		Constructor3() {
			System.out.println("Running Class Constructor3 constructor..");
		}
		void display() {
			System.out.println("I am display() of class Constructor3.");
		}
	}
	class Constructor4 {
		int j = 10;
		Constructor4() {
			System.out.println("Running Class Constructor4 constructor..");
		}
		void display() {
			System.out.println("I am display() of class Constructor4.");
		}
	}
 class Constructor5 {
	public void display() {
			System.out.println("I am display() of class Constructor5.");
		}
		public static void main(String args[]) {
			System.out.println("Main() of Class Constructor5 is started...");
			Constructor3 a1 = new Constructor3();
			a1.display();
			System.out.println("Class Constructor3 global varibale i = " + a1.i);
			Constructor4 x1 = new Constructor4();
			x1.display();
			System.out.println("Class Constructor4 global varibale j = " + x1.j);
			Constructor5 c1 = new Constructor5();
			c1.display();
			System.out.println("Main() of Class Constructor5 is ends here...");
		}
	}