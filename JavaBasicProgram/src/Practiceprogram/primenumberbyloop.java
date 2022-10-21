package Practiceprogram;

public class primenumberbyloop {

	public static void main(String[] args) {
int num=10;
int counter=0;
for(int i=1;i<=num;i++) {
	if(num%i==0) {
		++counter;
	}
}
if(counter==2) {
	System.out.println("prime number" +num);
}
System.out.println("check give number is prime or not: "+checkPrimeNumber(11));
checkPrimeNumberTillPassedNumber(5);
	}
static boolean checkPrimeNumber(int num) {
	int counter = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				++counter;
			}
		}
		if (counter == 2) {
			System.out.println("Prime Number: " + num);
			return true;
		} else {
			System.out.println("Number is not a prime: " + num);
			return false;
		}
}
static void checkPrimeNumberTillPassedNumber(int num) {
	if (!(num == 0 || num == 1)) {
		for (int i = 2; i < num; i++) {
			int counter = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					++counter;
				}
			}
			if (counter == 2) {
				System.out.println("Prime Number: " + i);
			}
		}
	}else {
		System.out.println("Either the given number is 0/1, so won't it consider for prime number");
	}
}

	}


