package Practiceprogram;

public class array6 {
//2d array by using for numbers
public static void main(String[] args) {
int array[][]= {{12,43,70},{43,90},{67,90,81,56}};
for(int i=0;i<array.length;i++) {
	for(int j=0;j<array[i].length;j++) {
		System.out.print(array[i][j]+ " ");

	}
	System.out.println();

}
System.out.println("++++++++++++++++++++++++++++");
//2d array by using character array 
	char[][] array1={{'q','w','e','r'},{'a','s'},{'z','x','c','v'}};	
//by using for each loop
	for(char a=0;a<array1.length;a++) {
for(char b=0;b<array1[a].length;b++) {
	System.out.print(array1[a][b]+ " ");
}
System.out.println();
	}
	}
	}


