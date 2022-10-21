package JavaBasic;

public class Operators1 {

	public static void main(String[] args) {
	int a=25;
	int b=a;
	System.out.println("a="+a);//25
	System.out.println("b="+b);//25
	
 /*Pre: means first perform the operation then use the updated value.
 * Post: it means first use the value then perform the operation. 
 */
	int k=++a;
	System.out.println("k="+k);//26
	System.out.println("a="+a);//26
	
    int j=k++;
	System.out.println("k="+k);//27
	System.out.println("j="+j);//26

	int r=50 ;
	System.out.println("r="+r++);//50
	System.out.println("r="+r);//51
	System.out.println("r="+ ++r);//52
	System.out.println("r="+r);//52

	int x=200;
	System.out.println("x="+--x);//199
	System.out.println("x="+x);//199
	System.out.println("x="+x--);//199
	System.out.println("x="+x);//198

	}

}
