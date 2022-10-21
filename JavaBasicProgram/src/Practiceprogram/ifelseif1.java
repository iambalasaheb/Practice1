package Practiceprogram;

public class ifelseif1 {

	public static void main(String[] args) {
int marks=70;
if(marks<50) {
  System.out.println("fail");
}else if(marks>=50&&marks<60){
	  System.out.println("passing with grade Pass");
}else if(marks>=60&&marks<65){
	  System.out.println("passing with grade first class");
}else if(marks>=65&&marks<70){
		  System.out.println("passing with grade first class with distingtion");
}else if(marks>=70&&marks<85){
	  System.out.println("passing with grade A");
}else if(marks>=85&&marks<=100){
	  System.out.println("passing with grade A+");
}else {
	System.out.println("invalid");
}
}
	}