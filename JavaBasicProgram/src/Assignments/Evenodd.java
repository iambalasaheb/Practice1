package Assignments;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=51;
if (a%2==0) {
	System.out.println("even number"); 
}else {
	System.out.println("odd number"); 
}//by using method void with parameters
Evenoddnumber(20);
Evenoddnumber(199);
Evenoddnumber(511);
Evenoddnumber(711);
//by using boolean with parameter and return value
System.out.println("number is even="+Evenoddnumber1(67));
System.out.println("number is even="+Evenoddnumber1(711));
System.out.println("number is even="+Evenoddnumber1(200));

	}
static void Evenoddnumber(int a){
if (a%2==0) {	
	System.out.println("even number"+a); 
}else {
	System.out.println("odd number"+a); }
}
static boolean Evenoddnumber1(int a) {
	if (a%2==0) {	 
return true;}
	else {
 return false;}
}
}