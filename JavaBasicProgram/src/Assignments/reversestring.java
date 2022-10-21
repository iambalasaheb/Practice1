package Assignments;

public class reversestring {

	public static void main(String[] args) {
    String s="BHALGAON";
    int a=s.length();
    String t="";
    for(int i=a-1;i>=0;i--) {
    	t=t+s.charAt(i);
    }System.out.println(" "+t);    
	}

}
