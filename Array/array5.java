package Array;

class array{
//creating method which return is array
static int[] getarray() {
//	int[] arr=new int[6];
//	arr[0]=12;
//	arr[1]=10;
//	arr[2]=39;
//	arr[3]=76;
//	arr[4]=82;
//	arr[5]=11;
//	 return arr;
	 return new int[] {12,10,39,76,82,11};
}
}
public class array5 {  
	public static void main(String[] args) {
	//by calling method 
	//by using println stat. shows hexadecimal adress
	//System.out.println(array.getarray());
 //need to store the value of array method in variable then we can only print it by 
//using for loop or for each loop
   int arr[]= array.getarray();
	//by using for loop to print the values
   for(int i=0;i<arr.length;i++) {
	     System.out.println("for loop value= "+arr[i]);
   }
	}
}

