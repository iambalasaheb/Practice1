package mock;

public class Primenumber2 {

	public static void main(String[] args) {
    int num=7;
    int ct=0;
    for(int i=1;i<=num;i++) {
    	if(num%i==0) {
    		++ct;
    	}
    }if(ct==2) {
    		System.out.println("given number is prime"+num);
    	}else {
    		System.out.println("given number is not a prime"+num);
    	}
    }
	}


