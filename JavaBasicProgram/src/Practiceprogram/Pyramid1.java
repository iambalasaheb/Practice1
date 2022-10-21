package Practiceprogram;

public class Pyramid1 {

	public static void main(String[] args) {
    int row=6, num; 
    for(int i=0;i<row;i++) {//no of lines in pyramid
	for(int j=row;j>i;j--) {//format or spaces used to design the in pyramid
		System.out.print(" ");
	}
	num=1;
	for(int j=0;j<=i;j++) {//print number in pyramid
		System.out.print(num+" ");
          num=num*(i-j)/(j+1);
	}
	System.out.println();
}
	}

}
