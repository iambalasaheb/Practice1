package JavaBasic;

public class Demo1
{
	static double sallary=25000;
	static int emid=12345;
			
	public static int printemid(){
	System.out.println("program starts");
	System.out.println("print empid is running");
	return 12345;
	}
	public static void sallary() {
		System.out.println("program starts");
		System.out.println("the value of sallary="+sallary);	
	}
	public static void main(String[] argo) {
          int age=25;    
	System.out.println("program starts");
    System.out.println("age="+age);
    System.out.println("sallary="+sallary);
    System.out.println("empid="+emid);
Demo1.printemid();
Demo1.sallary();
int id=Demo1.printemid();
System.out.println("program starts="+id);

	}

}
