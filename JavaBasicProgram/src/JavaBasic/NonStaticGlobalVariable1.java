package JavaBasic;

public class NonStaticGlobalVariable1 {
int age=20;
boolean result=true;
char grade='A';
double roi=209.99d;
	public static void main(String[] args) {
		//syntax to declare the object;
		NonStaticGlobalVariable1 ref;
		ref=new NonStaticGlobalVariable1();
	System.out.println("program starts");
	System.out.println("the age of person="+ref.age);
	System.out.println("passing result="+ref.result);
	System.out.println("grade="+ref.grade);
	System.out.println("rate of interest of sbi="+ref.roi);
ref.age=26;
ref.result=true;
ref.grade='B';
ref.roi=500.88;
System.out.println("age="+ref.age);
System.out.println("passing result="+ref.result);
System.out.println("grade="+ref.grade);
System.out.println("rate of interest of sbi="+ref.roi);
NonStaticGlobalVariable1 ref1;
ref1=new NonStaticGlobalVariable1();
System.out.println("age="+ref1.age);
System.out.println("passing result="+ref1.result);
System.out.println("grade="+ref1.grade);
System.out.println("rate of interest of sbi="+ref1.roi);



	}

}
