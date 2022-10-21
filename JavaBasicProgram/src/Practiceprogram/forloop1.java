package Practiceprogram;

public class forloop1 {

	public static void main(String[] args) {
for(int i=0;i<3;i++) {
	System.out.print("Hello " +i);
for(int j=0;j<3;j++) {
	System.out.print("Hii " +i);
	for(int k=2;k>0;k--) {
		System.out.println("bye " +i);//here calling for loops inside each othar
		//the values comes hello=3, hii=9, bye=18 times shows(3),(3*3),(3*3*2).	
}}}	
for(int i=0;i<=2;i++) {
	System.out.println("" +i);
	i=i+1;
}//check odd number by using for loop
for(int i=0;i<60;i++) {
	if(!(i%2==0)){
		System.out.print("" +i);
	}
	}
	//check odd number by using for loop
	for(int j=0;j<67;j++) {
		if(j%2==0){
			System.out.print("" +j);
		}
}//infinite loop
	for(int a=0;a>=0;a++) {
		if((a%2==0)) {
			System.out.println("" +a);
		}
	}
	}
	
	}
	