package Arraysassignments;

public class example12 {

	public static void main(String[] args) {
		// java program to print the sum of all array element
		int[] array= {10,30,20,60,50,40};
		double sum=0;
		//by using for each loop
		for(int a:array) {
		 sum=sum + a;
}
		System.out.println("sum of all elements of an array= "+sum);
	}
}
