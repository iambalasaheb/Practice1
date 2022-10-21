package Collection;
import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
     ArrayList list=new ArrayList();//creating arraylist having default size is 10
     list.add("Mango");//auto upcasting from string to object class object
     list.add("123456");//boxing for int to Integaer class object then upcasting to object class
     list.add("bannana");//upcasting from string object to object class object
     list.add("C");//boxing for char to Character class object then upcating to object class object  
     list.add("25.56");//boxing for double to Double class object then upcating to object class object
     list.add("true");//boxing for boolean to Boolean class object then upcating to object class object
     list.add("new Arraylist1");//Arraylist1 class object upcasted to object of class object
     list.add("Mango");//duplicate object
     //printing the array list object
     System.out.println("size of list= "+list.size());
     System.out.println("element of list= "+list);//to string override in collection
     //list print by using for loop
     for(int i=0;i<list.size();i++) {
         System.out.println("using for loop= "+list.get(i));
     }//by using for each loop lhs should equal rhs i.e Object
     for(Object a:list) {
         System.out.println("for each loop= "+a);
     }//Acsesing the elements
     System.out.println("accsessing element= "+list.get(3));//acses 2 nd place elem. for indexing
     //changing the value of existing object or element
     System.out.println("= "+list.set(1, 67890));
     System.out.println("size of list= "+list.size());
     System.out.println("elements of list= "+list);
	}

}
