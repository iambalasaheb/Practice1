package Practiceprogram;

public class Operators1 {

	public static void main(String[] args) {
		boolean res1,res2;
int num1=30,num2=50;
res1=(num1!=num2);
res2=(num1<num2);
System.out.println("the result of res1="+res1);
System.out.println("the result of res1="+res2);

//logical and
System.out.println("res1 && res2 ="+(res1&&res2));
//logical or
System.out.println("res1 && res2 ="+(res1||res2));
//logical not
System.out.println("res1 && res2 ="+!(res1&&res2));

	}

}
