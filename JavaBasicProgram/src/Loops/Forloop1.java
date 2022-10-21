package Loops;

public class Forloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<=3;i++) {
		System.out.println(i);
}
for (int k=0;k<2;k++) {
	System.out.println(k);
}
//find out even numbers in 1-50
for(int i=0;i<50;i++) {
	if(i%2==0) {
		
	System.out.println("even numbers is="+i);
	}
	//find out odd numbers in 1-50
	for(int j=0;j<60;j++) {
		if(!(j%2==0)) {
			System.out.println("odd numbers="+j);

		}
	}
}
	}

}