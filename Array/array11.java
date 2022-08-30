package Array;
import java.util.Arrays;
public class array11 {
	public static void main(String[] args) {
		int[] arr= {10,30,54,30,20,1,80,30};
       //printing an array
		for(int a:arr) {
		     System.out.println(a);
		}
    System.out.println("********************************************");		
	//by using clone method of array
		int[] clonearr=arr.clone();
		for(int b:clonearr) {
		     System.out.println(b);
		}
	//check are both equal or not by using equals method from Arrays
    System.out.println(Arrays.equals(arr, clonearr));
   System.out.println("********************************************");
   int[] arr1=Arrays.copyOf(arr, arr.length);
   //using for each
   for(int c:arr1) {
	  System.out.println(c);
   }
   System.out.println("********************************************");
   //using copy of range
  int[] arr2= Arrays.copyOfRange(arr,2,6);
   //using for each
   for(int d:arr2) {
   System.out.println(d);   
	}
   //check equal by equals methods betn arr2 & arr1
   System.out.println(Arrays.equals(arr1, arr2));	
  System.out.println("********************************************");
 //sort the element by sortmethod and print them
  Arrays.sort(arr2);
 for(int e:arr2) {
     System.out.println(e);
 }
	}
}
