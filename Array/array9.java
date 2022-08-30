package Array;

public class array9 {

	public static void main(String[] args) {
  //declaring and initilizing array
		int[][] arr= {{12,43,56,78,90},{34,65,12,31},{45,23,67}};
 	   System.out.println("size of an array= "+arr.length);  
 	   //it shows smallest size of rows		   
  //using for for printing matrix
 	   for(int i=0;i<arr.length;i++) {
 		   for(int j=0;j<arr[i].length;j++) {
 		 	   System.out.print(arr[i][j]+"   ");  
 		   }
 	 	   System.out.println();  
 	   }
       System.out.println("********************************************");
  //write same as characters array
       char [][]arr1= {{'a','f','r','w'},{'a','b','c'},{'w','x','y','z'}}; 
       //for printing use for loop
       for(char a1=0;a1<arr1.length;a1++) {
    	   for(char a2=0;a2<arr1[a1].length;a2++) {
 		 	   System.out.print(arr1[a1][a2]+"   ");  
    	   } 	 	
    	   System.out.println();  
       }
}
}