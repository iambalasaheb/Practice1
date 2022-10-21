package mock1;

public class Armstrong {

	public static void main(String[] args) {
		int num=1634;
		double sum=0;
		int temp=0,power=0,rem=0;
		temp=num;
		while(temp>0) {
			temp=temp/10;
		power++;
			//here temp becomes zero
		}
		//initialize temp again
		temp=num;
		while(temp>0) {
			rem=temp%10;
			sum=sum+Math.pow(rem, power);
			temp=temp/10;
		}
	if(sum==num) {
	System.out.println("given number is Armstrong");
	}else {
System.out.println("given number is not armstrong");	

}
}
}
/*logic
 * when number is 153=1^3+5^3+3^3=153----------------->no is armstrong
 * otherwise not armstrong
 * 
 */
