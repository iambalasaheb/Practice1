package Arraysassignments;

public class example24 {

	public static void main(String[] args) {
//print odd and even number from an array
		int[] arr= {1,2,5,4,0,3,7,8,9,10,11,11,13,14,15,16};
//first print even numbers from array
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
		        System.out.println(arr[i]);  
			}
		}
        System.out.println("**************************************");  
      //now print odd numbers from array
        for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
		        System.out.println(arr[i]);  
			}
		}
	}

}
