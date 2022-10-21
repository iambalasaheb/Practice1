package Arraysassignments;

public class example4 {

	public static void main(String[] args) {
		// java program to print the duplicate elements of array
		char[] array= {'a','d','g','f','z'};
		System.out.println("array length= "+array.length);
		//by using clone method to print duplicate of array
        char[] array1=array.clone();
        for(char i=0;i<array1.length;i++) {
    		System.out.println("by using for loop for clone or duplicate = "+array1[i]);

        }
	}

}
