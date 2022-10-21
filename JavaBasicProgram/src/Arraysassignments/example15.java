package Arraysassignments;
import java.util.Arrays;
public class example15 {

	public static void main(String[] args) {
		// to sort the array elements in descending order
		int[] arr= {12,32,41,15,60,90};
		System.out.println("array length= "+arr.length);
		Arrays.sort(arr);
		//by using predefine sort method and for loop prints the elements in descending order
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("array length= "+arr[i]);

		}
	}

}
