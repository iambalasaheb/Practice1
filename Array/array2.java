package Array;

public class array2 {

	public static void main(String[] args) {
//declaration and size initialization of an array
		int[] array=new int[5];
		//try to print witout initializing elements
	     System.out.println(array[0]);
	     System.out.println(array[1]);
	     System.out.println(array[2]);
	     System.out.println(array[3]);
	     System.out.println(array[4]);
	     //initialization of elements
	     array[0]=10;
	     array[1]=20;
	     array[2]=30;
	     array[3]=40;
	     array[4]=50;
	     //after initialization of array elements
	     System.out.println(array[0]);
	     System.out.println(array[1]);
	     System.out.println(array[2]);
	     System.out.println(array[3]);
	     System.out.println(array[4]);
//to find array element count
	     System.out.println("array element count= "+array.length);
//by using for ;oop to print array element
	     for(int i=0;i<array.length;i++) {
		     System.out.println("using for loop= "+array[i]);
		     //u can also print same element by using each for loop
		     for(int b:array) {
			     System.out.println("using for each loop= "+b);
		     }
	     }
	     //by using char array u can also print the array elements
	     char[] b1= {'a','r','y','z'};
	     System.out.println("char array element count= "+b1.length);
	     //by using for each loop
	     for(char z:b1) {
		     System.out.println("char array element by using foreach loop= "+z);
	     }

	}

}
