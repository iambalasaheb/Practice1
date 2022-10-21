package Collection;

import java.util.ArrayList;

public class Arraylist3 {

	public static void main(String[] args) {
       ArrayList a1=new ArrayList();
       //without declaring elements
       System.out.println("initial list of the elements= "+a1); 
       System.out.println("elements of arraylist= "+a1.isEmpty()); 
//adding elements to the end of the list
       a1.add("Ravi");
       a1.add("Vijay");
       a1.add("Ajay");
//calling elements after adding
       System.out.println("after adding list of the elements= "+a1); 
//Adding an the element in specific position
       a1.add(1,"Gaurav");//method add with index
       System.out.println("after adding gaurav elements= "+a1); 
//now creating new object of arraylist
       ArrayList a2=new ArrayList();
    a2.add("Sonu");
    a2.add("Hanuman");
    System.out.println("a1 elements= "+a1); 
    System.out.println("a2 elements= "+a2); 
//Adding second list element to the first element
    a1.addAll(a2);//method to add all new list elements in first list
    System.out.println("a2 elements add in a1= "+a1); 
 //creating new object of arraylist again
    ArrayList a3=new ArrayList();
   a3.add("John");
   a3.add("Rahul");
   System.out.println("a2 elements= "+a2); 
   System.out.println("a3 elements= "+a3); 
//Adding 3rd list elements in 2nd list @specific position
   a2.add(1,a3);
   System.out.println("a2 elements= "+a2); 

	}

}
