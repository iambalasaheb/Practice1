package Practiceprogram;

public class array2 {

	public static void main(String[] args) {
		int[] work = {2,-9,0,5,12,-25,22,9,8,12};
		double sum=0;
		double avarage;
		//access all elements using for each loop add each element in sum
		for(int num:work ) {
			//System.out.println("for each loop array "+a); 
           sum= sum+num;
           //sum+=number;
		}
           //to get total number of elements
           int arraylenght=work.length;
           //calculate the average and convert it in int to double
           avarage=sum/arraylenght;
			System.out.println("sum= "+sum); 
			System.out.println("avarage= "+avarage); 
		}
	}


