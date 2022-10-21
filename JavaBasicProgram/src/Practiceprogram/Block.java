package Practiceprogram;

public class Block {
	
	Block(){
		this(30);
          System.out.println("iam zero constructor");
	}
	Block(int i){
        System.out.println("iam paraneters constructor");
	}
	static{
	System.out.println("1st static block");
	}
	 {
		System.out.println("1st nonstatic block");
		}
	public static void main(String[] args) {
		System.out.println("program starts");
         Block a1=new Block();
 		System.out.println("p^^^^^^^^^^^^^^^^^^");
        Block a2=new Block();

		System.out.println("program ends");
	}
	static{
		System.out.println("2nd static block");
		}
	{
		System.out.println("2nd nonstatic block");
		}

}//nonstatic block execute at every time whenever instance/object created.
//all static blocks runs first in series after execution started i.e before program starts statement.
//after static blocks execution then nonstatic block execution started same as static in series after creation of object i.e before constructor call statement.