package Practiceprogram;

public class forloop {

	public static void main(String[] args) {
		//print below statement 5 times
for(int i=0;i<5;i++) {
	 System.out.println("hello good morning");
}	 
System.out.println("+++++++++++++++++++++++++++++++++");
//printing 0-15 numbers
for(int i=0;i<=15;i++) {
	 System.out.println(i);
}
System.out.println("+++++++++++++++++++++++++++++++++");
//printing numbers 12-0
for(int i=12;i>0;i--) {
	 System.out.println(i);
}//printing charachter A-Z
System.out.println("+++++++++++++++++++++++++++++++++");
for(char a='A';a<='Z';a++) {
	 System.out.println(a);
}//printing charachter z-a
System.out.println("+++++++++++++++++++++++++++++++++");
for(char i='z';i>='a';--i) {
	 System.out.println(i);
}
for(int i=59;i>=56;i--) {
	 System.out.println(i);
}
//when i<x then use increment x++(value increasing)
//when i>x then use increment x--(value decreasing)

	}

}
