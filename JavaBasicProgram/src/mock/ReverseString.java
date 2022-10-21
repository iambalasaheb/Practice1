package mock;

public class ReverseString {	
  	public static void main(String[] args) {
  	String s="balasaheb";
  	int a=s.length();
  	String t="";
  	for(int i=a-1;i>=0;i--) {
  		t=t+s.charAt(i);
  	}
  		System.out.println("reverse string= "+t);
  	}
}
