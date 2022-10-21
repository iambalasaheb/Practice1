package Arraysassignments;

public class example7 {

	public static void main(String[] args) {
//java program to print elements of array at even position
		int[] arr= {1,2,5,4,0,3,7,8,9,10,11,11,13,14,15,16};
//by using for loop we can print the elements who has taking place at even position
		System.out.println("Elements of given array present on even position: ");  
//for even place condition use is i=i+2 instead of increment
 //Here, i will start from 1 as first even positioned element is present at position 1.  
      for(int i=1;i<arr.length;i=i+2) {
        System.out.println(arr[i]);  

      }
    }  
}  

