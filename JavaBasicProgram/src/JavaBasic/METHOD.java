package JavaBasic;

public class METHOD {
		// static global variables
		static int age;
		static double salary;	
		//static method with return value no argument
		public static int test1() {
			int pin=12345;
			//System.out.println("I am test1 method.");
			System.out.println("the value of pin="+pin);

			//logic		
//			int pin=201201;
//			return pin;
			return pin;
		}
		//static method without return value no argument
		static void test2() {
			System.out.println("I am test2 method");
			//return; this will be written by java compiler at compile
		}
		//static method with return value along with argument
		static double test3(boolean b1) {
			double age=34.5;
			//System.out.println("the value of age="+age);
			System.out.println("the answer is "+b1);
			return age;
		}
		
		//static method without return value along with argument
		static private void test4(float f) {
			System.out.println("test 4 ioi="+f);
		}
				
	public static void main(String[] args) {
		System.out.println("program starts");
		System.out.println("the value of age="+METHOD.age);
		System.out.println("the value of salary="+METHOD.salary);
test1();
test2();
test3(false);
test4(4.5f);
System.out.println("+++++++++++++++++++++++++++");
METHOD.test1();
METHOD.test2();
METHOD.test3(false);
METHOD.test4(4.5f);
System.out.println("+++++++++++++++++++++++++++");
System.out.println("the value of age="+METHOD.test1());
//System.out.println("the value of age="+METHOD.test2());
System.out.println("the value of age="+METHOD.test3(true));
//System.out.println("the value of age="+METHOD.test4(60.9f));


	}

}
