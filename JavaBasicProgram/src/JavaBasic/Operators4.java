package JavaBasic;

public class Operators4 {

	public static void main(String[] args) {
		
int a=0, b;
b=a++ + ++a + ++a + a;//0+2+3+3=8
System.out.println("a="+a);//3
System.out.println("b="+b);//8
a=0;
b=a--+ --a + --a + a;//-2-3-3
System.out.println("a="+a);//-2-1=-3
System.out.println("b="+b);//-8
a=0;
b=--a + --a + --a + a + ++a + a++;//-1-2-3-2-1=-9
System.out.println("a="+a);//-1
System.out.println("b="+b);//-9
a=0;
b=a-- + a + ++a + a++ + ++a + a++ + a;//-1+1+2+1
System.out.println("a="+a);//3
System.out.println("b="+b);//0-1+1+3+4=7

	}

}
