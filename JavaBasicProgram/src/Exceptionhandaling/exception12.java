package Exceptionhandaling;

public class exception12 {

	public static void main(String[] args)throws InterruptedException, UserDefinedException
	{
		System.out.println("program starts");
		try {  System.out.println("try block of setsleep start");
			setSleep(5000);
	    	  System.out.println("try block of setsleep end");

		}catch(InterruptedException e) {
	    	  System.out.println("catch block of sesleep start");
			  System.out.println("catch block"+e);
	    	  System.out.println("catch block set sleep end");
		}
        //setSleep(5000);
		try {
			System.out.println("try blockof checknumber start");
	        checkNumber(-5);
	    	System.out.println("try block of checknumber end");

		}catch(UserDefinedException f) {
	    	  System.out.println("catch block of checknum start");
			  System.out.println("catch bloock"+f);
	    	  System.out.println("catch block of check number end");
		}
       // checkNumber(-5);
		System.out.println("program ends");
	}
static void setSleep(long time) throws InterruptedException 
{
//	try {    	 
//		System.out.println("try block start");
		Thread.sleep(time);
//  	  System.out.println("try block end");
//	}catch(InterruptedException e) {
//  	  System.out.println("catch block start");
//		System.out.println("number is"+e);
//  	  System.out.println("catch block end");
//
//	}
}
static void checkNumber(int num) throws UserDefinedException
{
	
	if(num<0) {
	throw new UserDefinedException("number is less than zero");
	}
	else{
		System.out.println("number is"+num);
	}
}
}
/**
try-catch--> to handle the exception
throw------> to throw the exception from a method body, this needs to handled by using throws 
throws------> use to handle exception throws by a method while calling or use to declare a exception on method level
*/