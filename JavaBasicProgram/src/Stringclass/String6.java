package Stringclass;

public class String6 {

	public static void main(String[] args) {
      String s1="corejavabasic";
      //return the no. of char in string
  	System.out.println("string length s1= "+s1.length());
  	//returns the char at ith index
  	System.out.println("index number char= "+s1.charAt(3));
  	//return the substring from the orignal string from ith index
  	System.out.println("substring from the index of 4 = "+s1.substring(4));
  	//return the substring from i to j-1 index
  	System.out.println("substring from the index of 4 to 6 = "+s1.substring(4,6));
  	System.out.println("substring from the index of 1 to 5 = "+s1.substring(1,5));
//concatenate two string one back another
  	String s2="Java";
  	String s3="JavaBasic";
  	System.out.println("first value of s2= "+s2);
  	System.out.println("first value of s3= "+s3);
  	System.out.println("concatenates s2 ans s3= "+s2.concat(s3));
  	//after concate check values of strings
  	System.out.println("after concat value of s2= "+s2);
  	System.out.println("after concat of s3= "+s3);
  
     String p1="bhalgaon";
     String p2="pune";
     String x1=s2.concat(s3);
     String x2=p1.concat(p2);
     String x3=p1+p2;
     String x4=x1.concat(x2);
     //String d2=p1.concat(25);
     String d2=p1+25;
     //return the index within string of first occurance of the specified string
     String s5 = "Learn Share Learn Share";
   	System.out.println("size of string s5= "+s5.length());
   	System.out.println("index of share starts from= "+s5.indexOf("share"));
 // Returns the index within the string of the
    // first occurrence of the specified string,
    // starting at the specified index.
   	System.out.println("Index of a  = " + s5.indexOf('a',3));//next occurrence(index) of 'a' after index 3
    System.out.println("Index of e = " + s5.indexOf('e',11));//next occurrence(index) of 'e' after index 11
 // Checking equality of Strings
    String s6="Selenium";
    String s7="selenium";
    String s8="Selenium";
    System.out.println("Checking Equality of s6 & s7: " + s6.equals(s7));//
    System.out.println("Checking Equality of s6 & s8: " + s6.equals(s8));//
    System.out.println("Checking Equality of s6 & s7 with Ignore case: " + s6.equalsIgnoreCase(s7));//
 // Converting cases
    String word1 = "CoreJava";
    System.out.println("Changing to lower Case " +word1.toLowerCase());//corejava

    // Converting cases
    String word2 = "CoreJava";
    System.out.println("Changing to UPPER Case " + word2.toUpperCase());//COREJAVA

    // Trimming the word
    String word4 = "    Learn Share Learn    ";
    System.out.println("Actual String: "+word4);//    Learn Share Learn    
    System.out.println("Actaul lenght is: "+word4.length());
    System.out.println("After trim String: "+word4.trim());//Learn Share Learn
    System.out.println("After trim lenght is:" + word4.trim().length());//Learn Share Learn

    // Replacing characters
    String str1 = "CoreJavaBasic";
    System.out.println("Original String: " + str1);//CoreJavaBasic
    String str2 = str1.replace('a' ,'x') ;
    System.out.println("Replaced a with x -> " + str2);//CoreJxvxBxsic
   
    String str3=str1.replace("Java", "Net");
    System.out.println("Replaced 'Java' with 'Net' -> " + str3);//CoreNetBasic
    
    String str4=str1.replaceFirst("a", "W");
    System.out.println("Replaced first 'a' with 'W' -> " + str4);//CoreJWvaBasic
    String str5=" ";
    System.out.println("str5 is empty or not: "+str5.isEmpty());
    
    String str6=new String();
    System.out.println("str6 is empty or not: "+str6.isEmpty());       
  	

	}

}
