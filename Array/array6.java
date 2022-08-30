package Array;

public class array6 {

	public static void main(String[] args) {
   //showing array index out of bound
		int[] arr= {12,10,39,76,82,11};
   //using for loop to print element
		for(int i=0;i<=arr.length;i++) {
		 System.out.println(arr[i]);
//after print call it shows the element print but throws arrayindexoutofbound exception
//becouse array follow is an indexing series 
		}
	}

}
