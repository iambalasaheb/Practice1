package JavaBasic;

public class Operators2 {

	public static void main(String[] args) {
	int a=55, b;//b=55  a=55
	b=a++;
	int x=a, y;//x=56
	System.out.println("x="+x);//56
	y=++x;//y=57  x=57
	System.out.println("a="+a);//56
	System.out.println("b="+b);//55
	System.out.println("x="+x);//57
	System.out.println("y="+y);//57
	int p=50, q=40, res;
	res=p++ + --q;//res=89
	System.out.println("res="+res);//89
	System.out.println("y="+p);//51
	System.out.println("q="+q);//39
	System.out.println("***************************");
	int res1=++p + ++q;//res1=92
	System.out.println("res1="+res1);//92
	System.out.println("p="+p);//52
	System.out.println("q="+q);//40

	


	


	
	

	}

}
