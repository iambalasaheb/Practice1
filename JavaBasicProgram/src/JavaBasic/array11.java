package JavaBasic;
class Example{
	int age;
	double sallary;
	Example(){
		System.out.println("iam zero para constructor");
	}
	Example(int a){
	System.out.println("iam int type para constructor"+a);
	}
	Example(double a){
	System.out.println("iam double type para constructor "+a);
	}
	void calling() {
		System.out.println("iam void calling method");
		System.out.println("the value of age="+age);
		System.out.println("the value of sallary="+sallary);
	}
}
public class array11 {
	public static void main(String[] args) {
		System.out.println("************************************");
Example a1=new Example();
Example a2=new Example(25);
Example a3=new Example(50000.55);
a1.calling();
a2.calling();
a3.calling();
int empid1=301,empid2=101,empid3=201;
int empid[]=new int[3];//or we can write like this also
//int empid[]= {301,101,201};
empid[0]=301;
empid[1]=101;
empid[2]=201;//by using for each loop we can print array also
for(int i:empid) {
	System.out.println(+i);
}
System.out.println("************************************");
Example[] e=new Example[3];
e[0]=new Example();
e[1]=new Example(25);
e[2]=new Example(50000.99);

e[0].calling();
e[1].calling();
e[2].calling();
		
	}

}
