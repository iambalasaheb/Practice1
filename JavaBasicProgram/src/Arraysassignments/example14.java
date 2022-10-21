package Arraysassignments;
import java.util.Arrays;
public class example14 {

	public static void main(String[] args) {
		// to sort the array elements in ascending order
		int[] arr= {12,32,41,15,60,90};
		System.out.println("array length= "+arr.length);
  //sorting the element of ascending order by using import statment
     Arrays.sort(arr);
  //using for-each loop or for loop also we can print elements in ascending order
//      for(int a:arr) {
//	System.out.println("array length= "+a);
//	}
   //using for loop to print elements in ascending order
	for(int i=0;i<arr.length;i++) {
		System.out.println("array length= "+arr[i]);
	}
	}

}
