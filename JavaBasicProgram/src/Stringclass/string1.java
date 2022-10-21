package Stringclass;

public class string1 {

	public static void main(String[] args) {
    string1 a1=new string1();
    System.out.println("a1= "+a1);//string representation of an object
    //becouse of toString()
    //string class object creation by using literals
    //new object will be created in string constsnt pool
    String s1="mumbai";
    //no object will be created as its a duplicate object its pont to s1 object
    String s2="mumbai";
    //new object will be created in string constsnt pool
    String s3="banglore";
    
    System.out.println("s1= "+s1);//shows object value bec tostring override
    System.out.println("s2= "+s2); 
    System.out.println("s3= "+s3);
    //char counting method
    System.out.println("s1 char count= "+s1.length());
    System.out.println("s2 char count= "+s2.length());
    System.out.println("s3 char count= "+s3.length());
/*outside string class
 * == --> compare two values
 * 		.equals(obj) --> compare two objects based on there address
 * Inside String class:
 * 		== --> compare two objects based on address
 * 		.equals(obj) --> compare two objects based on value 
 */
    System.out.println("s1 and s2 using equals "+s1.equals(s2));//compare s1 & s2 values
    System.out.println("s1 and s2 using == "+(s1==s2));//compare s1 & s2 based on address
    
    System.out.println("s1 and s3 using equals "+s1.equals(s3));//compare s1 & s3 values
    System.out.println("s1 and s3 using == "+(s1==s3));//compare s1 & s3 based on address
    //2 objects created 1 in constatnt pool & 2nd in nonconstatnt pool
    String s4=new String("mumbai");
    System.out.println("s4= "+s4);
    System.out.println("s1 and s4 using equals "+s1.equals(s4));//compare s1 & s4 values
    System.out.println("s1 and s4 using == "+(s1==s4));//compare s1 & s4 based on address
    //2 objects created 1 in constatnt pool & 2nd in nonconstatnt pool
    String s5=new String("mumbai");
    System.out.println("s5= "+s5);
    System.out.println("s4 and s5 using equals "+s4.equals(s5));//compare s4 & s5 values
    System.out.println("s4 and s5 using == "+(s4==s5));//compare s4 & s5 based on address
    //2 objects created 1 in constatnt pool & 2nd in nonconstatnt pool
    String s6=new String("Hydrabad");
    System.out.println("s6= "+s6);
    System.out.println("s1 and s6 using equals "+s4.equals(s6));//compare s1 & s6 values
    System.out.println("s1 and s6 using == "+(s4==s6));//compare s1 & s6 based on address
    
    /**
    String-->	
    		predefined class in java belongs to java.lang package 
    		it represents group/collection of characters
    		In String class following methods are override
    				1. toString() --> instead of printing string representation of object it will print value stored 
    								  inside the string object
    				2. equals()   ---> overrided 
    				3. hashCode()
    		We can create String class object in two ways
    			1. by using new keyword
    						---> object will be stored in non constant pool
    						---> by using this we can have duplicate object also
    			2. by using literal 
    						---> object will be stored in String constant pool(inside heap)
    						---> by using this we can create only unique object inside the pool
    */
    
    
		
		
	}

}
