package JavaBasic;

public class Array8 {

	int age;
	double salary;
	Array8(){
		System.out.println("Zero-param");
	}
	Array8(int a){
		age=a;
		System.out.println("int-param");
	}
	Array8(double a){
		salary=a;
		System.out.println("double-param");
	}
	void calling() {
		System.out.println("calling of Example1 class, age: "+age);
		System.out.println("calling of Example1 class, salary: "+salary);
	}

	public static void main(String args[]) {
				
		System.out.println("******************************");
		Array8 e2=new Array8();
		Array8 e3=new Array8(15);
		Array8 e4=new Array8(25.36);
		e2.calling();
		e3.calling();
		e4.calling();	
		
		int empId1=101,empId2=102,impId3=103;
		int[] empId=new int[3];
		empId[0]=101;
		empId[1]=102;
		empId[2]=103;
		
		System.out.println("*******************************");
		Array8[] e=new Array8[3];
		e[0]=new Array8(); 		//e2
		e[1]=new Array8(15);		//e3
		e[2]=new Array8(25.36);	//e4
		
		e[0].calling();//e2.calling();
		e[1].calling();//e3.calling();
		e[2].calling();//e4.calling();
	}
}