package Practiceprogram;

public class thiskeyword3 {
	//Global Var
		int rollno;	
		float fee;
		thiskeyword3(int rollno, float fee) {
			System.out.println("local rollno : "+rollno);
			System.out.println("local fee : "+fee);
			System.out.println("intial global rollno : "+this.rollno);
			System.out.println("intialglobal fee : "+this.fee);
		//  Global Var = Local Var;
			this.rollno = rollno;	  
			this.fee = fee;
			System.out.println("after update, global rollno : "+this.rollno);
			System.out.println("after update, intialglobal fee : "+this.fee);
		}
		void display() {
			System.out.println(rollno + " "+ fee);
		}
	}
	class ThisKeyword11 {
		public static void main(String args[]) {
			System.out.println("*************with s1 reference***************");
			thiskeyword3 s1 = new thiskeyword3(111, 5000f);
			s1.display();
			System.out.println("*************with s2 reference************************");
			thiskeyword3 s2 = new thiskeyword3(112, 6000f);		
			s2.display();
		}

	}

