package mock1;

public class LeapYear {

	public static void main(String[] args) {
     
//		int num=2018;
//		if((num%4==0)&&(num%100!=0)||(num%400==0)) {
//		System.out.println("given year is leap year");	
//		}else {
//			System.out.println("given year is not leap year");
//		}
//
//		LeapYear a=new LeapYear();
		
//		a.Leap(2012);
		
		leap(2012);
		
	}
	
//	public void Leap(int num) {
//		if((num%4==0)&&(num%100!=0)||(num%400==0)) {
//			System.out.println("given year is leap year");	
//			}else {
//				System.out.println("given year is not leap year");
//			}
//	
//	}
public static void leap(int num) {
	if(num%4==0){
		if(num%100!=0) {
		System.out.println("given year is leap year=");
		}
	else {
		System.out.println("given year is a leap year=");
	}
	}else if (num%400==0) {
		System.out.println("given year is leap year");	}
	else {
		System.out.println("given year is not a leap year");
	}
	}
}