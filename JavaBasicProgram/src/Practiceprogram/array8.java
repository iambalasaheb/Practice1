package Practiceprogram;
import java.util.Arrays;
public class array8 {

	public static void main(String[] args) {
	int array[]= {20,30,40,50};
	System.out.println("Printing original array:");
for(int a:array) {
	System.out.println(a+" ");
}	
System.out.println("Printing clone of the array:");
int array1[]=array.clone();
for(int b:array1) {
	System.out.println(b+" ");
}
System.out.println("Are both equal array & clone of array ?");
System.out.println(Arrays.equals(array,array1));
System.out.println("******************************");
int newcopyofarray[]=Arrays.copyOf(array,array.length);
for(int c:newcopyofarray)
	System.out.println(c+" ");
System.out.println("******************************");
int newcopyrange[]=Arrays.copyOfRange(array,1,2);
for(int d: newcopyrange) {
	System.out.println(d+" ");
}
System.out.println("Comparing newCopiedRangeArray & newCopiedArray : "
		+Arrays.equals(newcopyofarray, newcopyrange));	
System.out.println("**************************");
Arrays.sort(array);//sort the array elements in ascending order and stores the sorted element in the same array
System.out.println("After sorting original array:");
for (int i : array) {
	System.out.println(i);
	}
	}
}

