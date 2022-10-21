package Array2;

public class example4 {

	public static void main(String[] args) {
int []array={10,30,48,50,50,60};
System.out.println("size of array "+array.length);
System.out.println("by using for loop for basic array");
//by using for loop
for(int i=0;i<array.length;i++) {
	System.out.print(array[i]+ " ");
}
System.out.println("++++++++++++++++++++++++++++");
System.out.println("by using for each loop for basic array");
//by using for ech loop
for(int num:array) {
	System.out.print(num+ " ");
}
System.out.println("++++++++++++++++++++++++++++");
//to create dupicte array of basic array by using clone
System.out.println("dupicate array having name array1");
int array1[]=array.clone();
for(int a:array1) {
	System.out.print(a+ " ");

}

}
	}


