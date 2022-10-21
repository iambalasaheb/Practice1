package Practiceprogram;

public class Pyramid2 {

	public static void main(String[] args) {
    int row=5, ct=1;
    
    for(int i=row;i>0;i--) {
	
	for(int j=1;j<=i*2;j++) {
		System.out.print("  ");
		
	}for(int j=1;j<=ct;j++) {
		System.out.print(j+" ");
		
	}for(int j=ct-1;j>=1;j--) {
		System.out.print(j+" ");
	}
	System.out.println();
    ct++;
   }
	}
    }
