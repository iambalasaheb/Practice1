package Practiceprogram;

public class array4 {
	
static int [] getarray(){
	//declaration
	//int[] getarray;
	//initialization
	//getarray=new int[] {12,34,56,78,34};
	return new int[] {12,34,56,78,34};
	
}
	public static void main(String[] args) {
		//System.out.println(" "+array4.getarray()); 
		int arr[]=array4.getarray();
		System.out.println(" "+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(" "+arr[i]);
		}
		for(int a:arr) {
			System.out.println(" "+a);

		}
	}
}
//exception case

/*	public static void main(String[] args) {

	int[] numbers = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };
	
	for(int i=0;i<numbers.length;i++) {//exception as arrayIndexOutOfBound
		System.out.println(numbers[i]);
	}
}

}
*/