package Array2;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
     int []array1=new int[5];
     int []array2=new int[5];
     Scanner a=new Scanner(System.in);
System.out.println("enter value in first array");
for(int i=0;i<5;i++) {
	array1[i]=a.nextInt();
}
System.out.println("first array element");
for(int i=0;i<5;i++) {
	System.out.println(array1[i]+ " " );
}
System.out.println("second array element");
for(int i=0;i<5;i++) {
	array2[i]=array1[i];
	System.out.println(array2[i]+ " " );

}
	}

}
