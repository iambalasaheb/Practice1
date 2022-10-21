package Practiceprogram;

public class Leapyear {

	public static void main(String[] args) {
int year=2019;
if(((year%4 ==0) && (year%100!=0))||(year%400 ==0)){
	System.out.println("given year is leap year");
}
else {
	System.out.println("given year is not leap year or comman year");
}
System.out.println("+++++++++++++++++++++++++++++++++");
//check1(2021);
System.out.println(""+check1(2020));
System.out.println("+++++++++++++++++++++++++++++++++");
//check2(2020);
System.out.println(""+check2(2022));

	}
	//declare various types of methods
static boolean check1(int year) {
		if(((year%4 ==0) && (year%100!=0))||(year%400 ==0)){
		System.out.println("given year is leap year=");
return true;
		}else {
			System.out.println("given year is a leap year=");
return false;
		}
}
static boolean check2(int year) {
if(year%4==0){
	if(year%100!=0) {
	System.out.println("given year is leap year=");
	return true;
	}
else {
	System.out.println("given year is a leap year=");
return false;
}
}else if (year%400==0) {
	System.out.println("given year is leap year");
	return true;
}
else {
	System.out.println("given year is not a leap year");
return false;
}
}
}
