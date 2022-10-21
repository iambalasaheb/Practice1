package Arraysassignments;

public class example9{

  static void large(int arr[]) {
	  int large=arr[0];
	  for(int i=1;i<arr.length;i++) {
		  if(large<arr[i]) {
		  large=arr[i];
	  }
  }	System.out.println("largest number of array= "+large);
  }
		public static void main(String args[]) {
		// print the largest element from array
		int[] arr= {10,20,40,30,70,50};
		large(arr);
}
}
