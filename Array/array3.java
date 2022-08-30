package Array;

public class array3 {

	public static void main(String[] args) {
     int[] array=new  int[]{12,34,56,10,20};
     //access each element of array
     System.out.println("array element count= "+array.length);
     System.out.println("array element 0th index= "+array[0]);
     System.out.println("array element 1th index= "+array[1]);
     System.out.println("array element 2th index= "+array[2]);
     System.out.println("array element 3th index= "+array[3]);
     System.out.println("array element 4th index= "+array[4]);
//by using for loop and if else condition
     for(int i=0;i<array.length;i++) {
       System.out.println("using for loop= "+array[i]);
      if(array[i]==10) {
     System.out.println("array is= "+array[i]);
     break;
      }
      else {
     System.out.println("array is not 10 ");
      }
     }
     System.out.println("********************************************");

     //by using for each loop with if else statement
     for(int a:array) {
         System.out.println("using for each= "+a);
 if(a==56) {
     System.out.println("array is= "+a);
 break;
 }else {
     System.out.println("array is not 56");

 }
     }
	}

}
