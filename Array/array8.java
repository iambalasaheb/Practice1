package Array;

public class array8 {

	public static void main(String[] args) {
//declaring and initiallizing 2D array
		int[][] arr=new int[3][3];//3 rows and 3 columns
	     System.out.println("length of an array= "+arr.length);
       for(int i=0;i<arr.length;i++) {//this using for row 
    	   for(int j=0;j<arr[i].length;j++) {//this using for column
    		System.out.print(arr[i][j]+ " ");  		   
    	   }
  	     System.out.println();
       }
       //initialization af an array
       arr[0][0]=85;
       arr[0][1]=10;
       arr[0][2]=15;
       arr[1][0]=95;
       arr[1][1]=45;
       arr[1][2]=25;
       arr[2][0]=75;
       arr[2][1]=59;
       arr[2][2]=50;
//after initilization printing of an array by using for loop
       System.out.println("********************************************");
       for(int i=0;i<arr.length;i++) {
    	   for(int j=0;j<arr[i].length;j++) {
       		System.out.print(arr[i][j]+ "  ");  		     
    	   }
    	   System.out.println();  		   
       }
       
	}

}
