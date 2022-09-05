package Array;

public class array1 {

	public static void main(String[] args) {
    //cars=new String[4];
    //or
    String[] cars=new String[4];
     
    cars[0]="Porsch";
    cars[1]="Bmw";
    cars[2]="Ferrary";
    cars[3]="Volvo";
// or we can declare like thiss also
    //String[] cars= {"Porsch","Bmw","Ferrary","Volvo"};
    //access the element of an array
    System.out.println("first or 0th index element= "+cars[0]);
    //change an array element
    cars[1]="Mercedies";
    System.out.println("second or 1th index element= "+cars[1]);
    //array element count
    System.out.println("total count of array element= "+cars.length);
    System.out.println("by using for loop to print all elements ");
    for(int i=0;i<cars.length;i++) {
     System.out.println("using for loop print elements= "+cars[i]);
    }
    //by using for each loop
    for(String a:cars) {
        System.out.println("using for each loop print elements= "+a);
//checking updated code
    }
    
	}

}
