package Practiceprogram;

public class Block1 {
	
static int age=25;
double sallary=15000.57;

static {
   age=30;
}
{
	sallary=45000.32;
}
	public static void main(String[] args) {
System.out.println("program starts");
System.out.println("static age value="+age);
System.out.println("*************************");
Block1 a1=new Block1();
System.out.println("value of sallary="+a1.sallary);
System.out.println("**********************");
	}

}
