package Arraysassignments;

public class example8 {

	public static void main(String[] args) {
		//java program to print elements of array at odd position
		int[] arr= {1,2,5,4,0,3,7,8,9,10,11,11,13,14,15,16};
//by using for loop we can print the elements who has taking place at odd position
		System.out.println("Elements of given array present on even position: "); 
//for odd place condition use is i=i+2 instead of increment
//Here, i will start from i=0 as first odd positioned element is present at position 0.  
		 for(int i=0;i<arr.length;i=i+2) {
		        System.out.println(arr[i]);  

		      }
	}

} //only diference in even & odd is in loop i=1 for even & i=0 for odd
