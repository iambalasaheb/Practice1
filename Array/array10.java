package Array;

import java.util.Arrays;

public class array10 {

	public static void main(String[] args) {
  //declaring array
		int[] arr= {10,30,54,30,20,1,80,30};
		//declaring Arrays class methods
		//using copyOf method from Arryas class with import ststement
		int []arr1=Arrays.copyOf(arr,arr.length);
		//using thif method we can make a only copy of orignal array 
		//for printing this new copy of array use for loop
		for(int i=0;i<arr1.length;i++) {
	 	 	   System.out.println("using for loop= "+arr1[i]);  
		}
	       System.out.println("********************************************");
		//use copyOfRange method 
		int[] arr2=Arrays.copyOfRange(arr, 1, 5);
		//again use for loop for printing copyofrange method
		//it copied only selected elements from an array
		for(int i=0;i<arr2.length;i++) {
	 	 	   System.out.println("using for loop= "+arr2[i]);  
		}
	   System.out.println("********************************************");
       //use sort method for sorting of elements in ascending oreder
	     Arrays.sort(arr2);
         //to print sorting element use for loop
	     for(int i=0; i<arr2.length;i++) {//we can also use for loop
	 	 	   System.out.println("using for loop= "+arr2[i]);  
	     }
	}

}
