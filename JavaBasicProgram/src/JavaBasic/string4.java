package JavaBasic;

public class string4 {

	public static void main(String[] args) {
    String s1="villagenamebhalgaon";
    //or
   // String s1=new String("villagenamebhalgaon");
    //returns the number of characters in the string
    System.out.println("string length= "+s1.length());
    //returns the characters at ith index
    System.out.println("character at 5th position= "+s1.charAt(4));
    //returns the substring from the ith character
    System.out.println("substring from the index 6= "+s1.substring(6));
    //return the substring from g to h index
    System.out.println("return the substring from index 5 to 13= "+s1.substring(5,13));
    System.out.println("return the substring from index 5 to 13= "+s1.substring(1,6));
    //concatenates the string2 to the end of string
    String s2="village";
    String s3="bhalgaon";
    System.out.println("first value of string s2= "+s2);
    System.out.println("first value of string s3= "+s3);
    System.out.println("concatinated string = "+s2.concat(s3));
    System.out.println("after concate string s2= "+s2);
    System.out.println("after concate string s3= "+s3);
String p1="pune";
String p2="mumbai";
String x1=s2.concat(s3);
System.out.println("concatinated string = "+s2.concat(s3));
String x2=p1.concat(p2);
System.out.println("concatinated string = "+p1.concat(p2));
String x=x1.concat(x2);
System.out.println("concatinated string = "+x1.concat(x2));
//String d1=p1.concat(25);//shows error
String d2=p1+25;
System.out.println("first value of string s2= "+p1+25);
//return the index within string
//of the first occurance of the string

String s5="learn share learn share";

System.out.println("size of s5 string = "+s5.length());
System.out.println("index of share starts from = "+s5.indexOf("share"));
//return the index within string
//of the first occurance of the string staring at specified index
System.out.println("index of a = "+s5.indexOf('a',5));
//next occurrence(index) of 'a' after index 5
System.out.println("index of e = "+s5.indexOf('e',11));
//next occurrence(index) of 'e' after index 11
//occurrence of 'Learn' before index 18
System.out.println("index of e = "+s5.lastIndexOf('e',12));
System.out.println("the last index of learn = "+s5.lastIndexOf("Learn",18));
//checking equality of string
String s6="Selenium";
String s7="selenium";
String s8="Selenium";
System.out.println("checking equality of s6&s7= "+s6.equals(s7));
System.out.println("checking equality of s6&s8= "+s6.equals(s8));
System.out.println("checking equality of s6&s7 in ignore case= "+s6.equalsIgnoreCase(s7));
//converting case 
String word1="CoreJava";
System.out.println("Changing to lower Case= " +word1.toLowerCase());//corejava
System.out.println("Changing to upper Case= " +word1.toUpperCase());//
//triming the word
String word2="    learn share learn      ";
System.out.println("actual string = "+word2);
System.out.println("actual string length = "+word2.length());
System.out.println("after trim string = "+word2.trim());
System.out.println("after trim length string = "+word2.trim().length());
//replacing characters
String a1="CoreJavaBasic";
System.out.println("actual a1 string = "+a1);
String a2=a1.replace("a","x");
System.out.println("replace a2 string = "+a2);
String a3=a1.replace("Java","Net");
System.out.println("replace a3 string = "+a3);
String a4=a1.replaceFirst("a","z");
System.out.println("replace a4 string by a z = "+a4);
String a5="";
System.out.println("str5 is empty or not: "+a5.isEmpty());
String a6=new String();
System.out.println("str6 is empty or not: "+a6.isEmpty());       







    


    
	}

}
