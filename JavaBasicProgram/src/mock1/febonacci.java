package mock1;

public class febonacci {

	public static void main(String[] args) {
     int a=1, b=2;
     int c;
     System.out.print(a+" "+b);
     for(int i=0;i<=6;i++) {
    	 c=a+b;
    	 System.out.print(" "+c);
    	 a=b;
    	 b=c;
    			 
     }
	}

}
