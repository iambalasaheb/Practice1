package Exceptionhandaling;

public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("program starts here");
int i=10;
int j=i/2;
System.out.println("result"+j);
//abnormal ststement
int[] empid=new int[3];
empid[3]=123;//ArrayIndexOutOFBaundsException
////abnormal statement
String a=null;
System.out.println(" string length  " +a);//null pointer exeption
//abnoramal statement
String s="123";
float num=Float.parseFloat(s);//number format exeption
System.out.println("= "+num);
System.out.println("program ends here");







	}

}
