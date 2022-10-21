package Practiceprogram;

public class Practice2 {
	static int age;
	static double sallary;
	static boolean result;
	static char grade;
	
 public static void main(String[] args) {
System.out.println("program starts");
System.out.println("deafault value of age="+age);
System.out.println("deafault value of sallary="+sallary);
System.out.println("deafault value of result="+result);
System.out.println("deafault value of grade="+grade);
System.out.println("program ends");
//initialization of static global variables
age=25;
sallary=25000;
result=true;
grade='A';
System.out.println("program starts");
System.out.println("updated value of age="+age);
System.out.println("updated value of sallary="+sallary);
System.out.println("updated value of result="+result);
System.out.println("updated value of grade="+grade);
System.out.println("program ends");
//initialization of static global variables again variables calling from standerd format
age=30;
sallary=35000;
result=false;
grade='C';
System.out.println("updated value of age="+Practice2.age);
System.out.println("updated value of sallary="+Practice2.sallary);
System.out.println("updated value of result="+Practice2.result);
System.out.println("updated value of grade="+Practice2.grade);



	}
}
