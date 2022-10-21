package Practiceprogram;

public class Array1 {
	public static void main(String[] args) {

//create an array
	//int[] arrayname=new int[]{12,40,37,60,50};
	//or u can write like this also
	int[] arrayname= {12,40,37,60,50};
	//access each array elements
	System.out.println("first element="+arrayname[0]); 
	System.out.println("second element="+arrayname[1]); 
	System.out.println("third element="+arrayname[2]); 
	System.out.println("fourth element="+arrayname[3]);
	System.out.println("fifth element="+arrayname[4]);
	System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
//by using for loop
	for(int i=0;i< arrayname.length;i++) {
		//System.out.println(arrayname[i]); 
if(arrayname[i]==60) {
	System.out.println("arrayname is  "+arrayname[i]); 
	break;
}else {
	System.out.println("arrayname is not 60"); 
}
	}
	System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	//by using for each loop
	for(int a:arrayname) {
		//System.out.println("for each loop "+a); 
		
		if(a==60) {
			System.out.println("arrayname is  "+arrayname[a]); 
         break;
		}else {
			System.out.println("arrayname is not 60"); 

		}
	}

}	
}