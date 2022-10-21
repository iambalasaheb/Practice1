package Stringclass;

public class String3 {

	public static void main(String[] args) {
   String s1="i am civil engineer,iam from maharastra";
   System.out.println("actual string s1= "+s1);
   //return type string in array string
   String[] array=s1.split(" ");
   for(String a:array) {
	   System.out.println("for each loop= "+a);
   }
	System.out.println("***************************");
   String s2="india is great country";
   System.out.println("actual string s2= "+s2);
   String[] array2=s2.split(" ",3);
   for(String b:array2) {
	   System.out.println("for each loop for string s2= "+b);
	}		
   System.out.println("***************************");
   String s3="iam living in pune";
   System.out.println("actual string s3= "+s3);
String[] array3=s3.split(" ");
String temp="";
//for(String c:array3) {
//	   System.out.println("for each loop for string s3= "+c);
//}
//for reverse String using for loop
for(int i=array3.length-1;i>=0;i--) {
	temp=temp+" "+array3[i];
}	 
System.out.println("reverce string statement= "+temp);
System.out.println("***************************");
String s4="     I am shailesh         ";
System.out.println("Actual String with spaces: "+s4);
System.out.println("Actual String length: "+s4.length());
//by using trim predefine method we can skiip the spaces befor snd after the string 
System.out.println("Actual String without spaces: "+s4.trim());
//below method call shows the string length after trim method 
System.out.println("Actual String length without spaces: "+s4.trim().length());
System.out.println("***************************");
String s5="I    am             shailesh";
System.out.println("Actual String with spaces: "+s5.trim());
System.out.println("Actual String length: "+s5.trim().length());
	}
	}
