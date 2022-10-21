package Practiceprogram;

public class array5 {

	public static void main(String[] args) {
//multidiamentional array
		int[][] array=new int[3][3];//3 rows and 3 columns
		System.out.println("array length" +array.length);
		for(int i=0;i<array.length;i++) {//row count
			for(int j=0;j<array[i].length;j++) {//cell count on current row
			System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	/*	array[0][0]=10;
		array[0][1]=20;
		array[0][2]=30;
		array[1][0]=40;
		array[1][1]=50;
		array[1][2]=60;
		array[2][0]=70;
		array[2][1]=80;
		array[2][2]=90;
		*/
//printing 2d array
		for(int i=0;i<array.length;i++) {//row count
			for(int j=0;j<array[i].length;j++) {//cell count on current row
			System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}	
	}

}

		