package Exceptionhandaling;
//throwing unchecked exception

public class exception8 {
	//function is to check person is eligible to vote or not
	public static void validage(int a) {
			if(a<18) {
			//throw arithmetic exception if not eligible to vote
	throw new ArithmeticException("person is not eligible to vote");			
			}else {
				System.out.println("person is eligible for vote");
			}
		}
	public static void main(String[] args) {
		System.out.println("program starts");
	//without handelling exception
   //validage(13);//thrown exception is not handled so program not running
		//handeling exception calling the function
		try {
			validage(13);
		}
		catch(ArithmeticException e){
			System.out.println("arithmetic exception "+e);
		}
		System.out.println("rest of the code.....");

	}
	}