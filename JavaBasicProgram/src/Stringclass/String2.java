package Stringclass;
import java.util.Scanner;
public class String2 {

	public static void main(String[] args) {
      String s1="Dhanoripune";
      char c=s1.charAt(0);
  	System.out.println("string representation of object= "+s1);
	System.out.println("char at 0th index= "+c);
	//to print one by one char of string
	for(int i=0;i<s1.length();i++) {
		System.out.println("for loop char= "+s1.charAt(i));
	}
	//to print one by one char of string from last index
	for(int i=s1.length()-1;i>=0;i--){
	System.out.println("for loop reverse char= "+s1.charAt(i));
	}
//for reverse string
	String temp=" ";//output reverse of string
	for(int i=s1.length()-1;i>=0;i--) {
		temp=temp+s1.charAt(i);
	}
	System.out.println("s1= "+s1);
	System.out.println("temp= "+temp);
	System.out.println(reverseString("DhanoriPune"));
    String s2="Banglore";
	System.out.println(reverseString(s2));
    Scanner scn=new Scanner(System.in);
    String s3;
	System.out.println("enter string to be reverse");
	s3=scn.next();//input from keybord in scanner
	System.out.println(reverseString(s3));//reverse of input
	// System.out.println(palinString("abcd"));
			String s4;
			System.out.println("Enter string to check for palindrome");
			s4=scn.next();
			palinString(s4);
	}
	static String reverseString(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		return temp;
	}

	static void palinString(String str) {
		String s1 = str;
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		if (temp.equals(s1)) {
			System.out.println("Given string is a palindrome..." + str);
		} else {
			System.out.println("Given string is not a palindrome..." + str);
		}

	}
	}
