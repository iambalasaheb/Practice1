package mock;

public class Febi {

	public static void main(String[] args) {
  //prime number
	int num=12;
	int counter=0;
	//using for loop
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			counter++;
		}
	}
	 if(counter==2) {
		System.out.println("given number is prime");
	}else {
		System.out.println("given number is not prime");
	}
}
}