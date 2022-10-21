package JavaBasic;

public class Operators3 {

	public static void main(String[] args) {
    int a=0,b;
    b= a++ + ++a + ++a + a;//b=0+2+3+3=8
    System.out.println("a="+a);//3
    System.out.println("b="+b);//8
    System.out.println("**************************************");
    a= -15;
    b= a-- + --a + --a + a;//b=-15-17-18-18=-68
 	System.out.println("a="+a);//-18
	System.out.println("b="+b);//-68
	
	a=56;
	b= --a + --a + --a + a + ++a + a++;//b=55+54+53+53+54+54=323
	System.out.println("a="+a);//55
	System.out.println("b="+b);//323

	a=-42;
	b= a-- +a+ ++a + a++ + ++a + a++ +a;//b=-42-43-42-42-40-40-39=-288
	System.out.println("a="+a);//-39
	System.out.println("b="+b);//-288

	}

}
