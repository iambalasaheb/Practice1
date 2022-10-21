package Arraysassignments;

public class example6 {

	public static void main(String[] args) {
		// java program to print element an array in reverse order
		int[] arr= {12,43,56,78,23};
		System.out.println("length of an array= "+arr.length);
  //to print in reverse order by using for loop
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("using for loop= "+arr[i]);

		}

	}

}
