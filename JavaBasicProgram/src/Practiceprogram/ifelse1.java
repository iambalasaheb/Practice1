package Practiceprogram;

public class ifelse1 {

	public static void main(String[] args) {
		//to check even-odd number
int a=20;
if(a%2==0) {
	System.out.println("given number is even");
}
else {	
	System.out.println("given number is odd");
}
System.out.println("+++++++++++++++++++++++++++++++++");
	//callin various methods
check1(34);
System.out.println("+++++++++++++++++++++++++++++++++");
System.out.println(""+check2(13));
System.out.println("+++++++++++++++++++++++++++++++++");
check3();
	}
	
static void check1(int a) {
	if(a%2==0) {
	System.out.println("even number");
	}else {
		System.out.println("odd number");
	}	
}
static boolean check2(int num) {
	if(num%2==0) {
		//System.out.println("given number is even "+true);
return true;
		}
	else {
		//System.out.println("given number is even= "+false);

return false;
	}
}
static void check3() {
	int num=53;
	if(num%2==0) {	
		System.out.println("even number");
	}else {
		System.out.println("odd number");
	}
}
}
