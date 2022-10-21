package mock1;

public class PalendromeNumber {

	public static void main(String[] args) {
		int n=454;
		int a,temp=0;
		int sum=0;
		temp=n;
		while(n>0) {
			a=n%10;
			sum=(sum*10)+a;
			n=n/10;
		}if(temp==sum) {
			System.out.println("given number is palendrome");
		}else {
			System.out.println("given number is not palendrome");
		}


	}

}
