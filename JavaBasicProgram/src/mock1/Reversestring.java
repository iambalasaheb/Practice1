package mock1;

public class Reversestring {

	public static void main(String[] args) {
    String s="Balasaheb";
    String b="";
    for(int i=s.length()-1;i>=0;i--) {
    	b=b+s.charAt(i);
    	
    }
    System.out.println("reverse string= "+b);
	}

}
