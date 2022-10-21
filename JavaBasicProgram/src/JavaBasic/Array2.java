package JavaBasic;

public class Array2 {

	public static void main(String[] args) {
		
int[] array=new int[4];//declaration and initialization
System.out.println(array[0]); 
System.out.println(array[1]);  
System.out.println(array[2]);  
System.out.println(array[3]);  
//initialization of array
array[0]=10;
array[1]=20;
array[2]=30;
array[3]=40;
System.out.println("after initialization of arrays"); 
System.out.println(array[0]); 
System.out.println(array[1]);  
System.out.println(array[2]);  
System.out.println(array[3]);  
//array element counts
System.out.println("array element counts= "+array.length); 
 //we can calculate by using for loop also
for(int i=0;i<array.length;i++) {
	System.out.println("using for loop "+array[i]); 
	}
//by using for each loop also we cand execute same array
for(int num:array) {
	System.out.println("using for each loop= "+num); 
}
System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
//taking another char example
char []array1=new char[] {'A','B','C','D','E'};
//or we can write this also
//char []array1= {'A','B','C','D','E'};
System.out.println(array1[0]); 
System.out.println(array1[1]);  
System.out.println(array1[2]);  
System.out.println(array1[3]);
System.out.println(array1[4]);  
System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
System.out.println("array element counts= "+array1.length); 
for(char i=0;i<array1.length;i++) {
	System.out.println("using for loop= "+array1[i]); 
}
for(char a:array1) {
	System.out.println("using for each loop= "+a); 
}
//taking another int example
System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
int []array2=new int[]{20,60,39,-30,80,39};
System.out.println("array element counts= "+array2.length); 
//by using for loop
for(int i=0;i<array2.length;i++) {
	System.out.println("using for loop= "+array2[i]); 
}
//by using for each loop
for(int a:array2) {
	System.out.println("using for each loop= "+a); 

}
}
}