package Exceptionhandaling;
//throwing user define exception
//class represents user define exception
class userdefineexception extends Exception {
//calling constructor of parrent exception
	userdefineexception(String str){
		super (str);
	}
}
//class that uses above my exception
public class exception9{
	public static void validage(int age) throws userdefineexception{
		if(age<18) {
			//throw arithmetic exception if not eligible to vote
			throw new userdefineexception("persion is not eligible to vote");
		}else {
			System.out.println("persion is eligible to vote");
		}
	}
	public static void main(String[] args) {	
try {
	validage(15);//when we write age 19 insted of 15 in tryblock dn it shows eligible  
}
catch(userdefineexception e){
	//e.printStackTrace();
	System.out.println(""+e);
}			
System.out.println("rest of the code");	
	}
}
/**
throw ---> is used to throw explicit exception from a method body, it can be checked or unchecked exception
	  ---> if its a checked exception dn you have handle it by using try-catch block or you can declare that exception
	  	   in method label using throws keyword in this case where ever this method gets called in that method you need
	  	   to handle to exception in order to continue the program

*/