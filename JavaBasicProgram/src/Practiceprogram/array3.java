package Practiceprogram;

public class array3 {
//creating method which recives an array as parameter
		static void min(int arr[]){//int arr[]=a={33,13,40,55,14,32};
			int min=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(min>arr[i]){
					min= arr[i];
				}
			}
			System.out.println("min number in array is= "+min); 
		}
		static void max(int arr[]) {
				int max=arr[0];
				for(int i=0;i<arr.length;i++) {
					if(max<arr[i]) {
						max=arr[i];
					}
				}
				System.out.println("max number in array is= "+max); 
			}
		
			public static void main(String[] args) {
				int a[]={13,33,40,55,14,32};//declaring and initializing array
				array3.min(a);//passing array to method
				array3.max(a);//passing array to method
				
	}

}
