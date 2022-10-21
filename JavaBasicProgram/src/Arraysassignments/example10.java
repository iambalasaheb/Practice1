package Arraysassignments;

public class example10 {
	// to print smallest number from aan array
	static void small(int arr[]) {
		int small=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(small>arr[i]) {
				small=arr[i];
			}
		}System.out.println("smallest number of array= "+small);
	}
	public static void main(String[] args) {
		int[] arr= {10,20,40,30,70,50};
		//method calling
		small(arr);

	}

}
