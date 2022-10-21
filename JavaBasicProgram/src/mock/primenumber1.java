package mock;

public class primenumber1 {

		public static void main(String[] args){
			prime(7,0);
		}
		public static void prime(int a,int temp) {
//			int a=7;
//			int temp=0;
			for(int i=2;i<=a-1;i++)
			{
			if(a%i==0)
			{  temp=temp+1;
			}
			}
			if(temp==0){
			System.out.println("given number is prime number");
			}
			else{
			System.out.println("given number is non-prime number");
			
			}
		
	}

}
