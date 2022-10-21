package JavaBasic;

public class objectclass1 {
		void callMe() {
			System.out.println("Hello");
		}
	}
 class Example4 extends objectclass1{

		static int last_roll = 100;
		int roll_no;
		// Constructor
		Example4()
	    {
	        roll_no = last_roll;
	        last_roll++;
	    }
		@Override
		public int hashCode() {
			return 505;
		}
		@Override
	    public String toString()
	    {
	        return "BasicCoreJava";
	    }
		// Driver code
		public static void main(String args[]) {
			Example4 s = new Example4();
			// Below two statements are equivalent
			System.out.println(s.hashCode());
			System.out.println(s);
			objectclass1 t1=new objectclass1();
			 System.out.println(t1);
			 System.out.println(t1.hashCode());
			 t1.callMe();
		}


	}


