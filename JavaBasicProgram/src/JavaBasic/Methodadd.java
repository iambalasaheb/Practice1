package JavaBasic;

public class Methodadd {
	
public static int Addition(int num1,int num2) {
	
	
	System.out.println("number1="+num1);
	System.out.println("number2="+num2);
	int result=num1+num2;
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("number1="+Addition(20,50));
int result=Addition(20,50);
System.out.println("final value="+result);
System.out.println("result1="+Addition(10,20));
System.out.println("result2="+Addition(100,100));
System.out.println("result3="+Addition(1,9));


	}

}
