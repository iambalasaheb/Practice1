package JavaBasic;

public class try1 {
/*
 * trying to print logical program using for loop
 */
	public static void main(String[] args) {
		
		String a="Balasaheb";
		int n=a.length();
		 char[] b=new char[n];
		 //String to array
		 for(int i=0;i<=n;i++) {
			 b[i] =a.charAt(n-1);
			 i--;
		 }
		 
	}
}
