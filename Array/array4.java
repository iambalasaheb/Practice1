package Array;

public class array4 {

	public static void main(String[] args) {
   int []arr= {10,20,60,70,40,30};
   double sum=0;
   double avarage=0;
   //by using for each loop //or for loop we can use anyone
   for(int a:arr) {
   System.out.println("array using foreach loop= "+a);
   sum=sum+a;   
   }  
   //now we need to find out no. of element for avrage calculation
   System.out.println("elements of an array= "+arr.length);
   System.out.println("********************************************");
   //storing the value of element length in variable
  int element=arr.length;
 avarage=sum/element;
 System.out.println("sum of total array elements= "+sum);
 System.out.println("avarage of total array elements= "+avarage);
 
	}

}
