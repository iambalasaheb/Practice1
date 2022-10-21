package Arraysassignments;
import java.util.Arrays;
public class example1 {

	public static void main(String[] args) {
		// TO copy all elements of array into another array
		int []array={10,20,30,40,50};
		System.out.println("array length= "+array.length);
		//to copy of all array element in another array by using copy of predefine method
		//using Arrays predefine class and import statement is mandatory otherwise shows error
		int[] newarray=Arrays.copyOf(array,array.length);
        for(int i=0;i<newarray.length;i++) {
    		System.out.println("newarray by using for loop= "+newarray[i]);

        }
	}

}
