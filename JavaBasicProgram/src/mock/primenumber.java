package mock;

public class primenumber {
	
static void Prime(int a) {
int num=a;
int temp=0;
for(int i=2;i<=a-1;i++) {
	if(a%i==0) {
		temp=temp+1;
	}
}
if(temp==0) {
	System.out.println("given number is prime");
}else {
	System.out.println("number is not prime");
}
	}

public static void main(String[] args) {
Prime(8);
}

}