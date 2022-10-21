package Collection;
import java.util.LinkedList;
public class Linkedlist1 {

	public static void main(String[] args) {
    LinkedList<String> l1=new LinkedList<String>();
	System.out.println("initallay elements in linkedlist l1= "+l1);
   l1.add("Ravi");
   l1.add("Vijay");
   l1.add("Ajay");
	System.out.println("after declaring elements in linkedlist l1= "+l1);
//adding the elements at the specific position
	l1.add(1,"Vivek");
	l1.add(4,"Yogesh");
	System.out.println("after adding elements in linkedlist l1= "+l1);
    LinkedList<String> l2=new LinkedList<String>();
     l2.add("Mangesh");
     l2.add("Tommy");
 	System.out.println("after declaring elements in linkedlist l2= "+l2);
//adding l2 list elements in l1 list
 	l1.addAll(l2);
	System.out.println("after adding l2 all elements in linkedlist l1= "+l1);
    LinkedList<String> l3=new LinkedList<String>();
    l3.add("Mayuresh");
    l3.add("Digvijay");
 	System.out.println("after declaring elements in linkedlist l3= "+l3);
 	//adding l3 list element in l1 list in specific position
     l1.addAll(1, l3);
 	System.out.println("after addAll at specific position elements in linkedlist l1= "+l1);
//adding an element at the first position
 	l1.addFirst("Rahul");
 	System.out.println("adding 1st position  position elements in linkedlist l1= "+l1);
//adding an element at last position
 	l1.addLast("Ddasaheb");
 	System.out.println("adding last position  position elements in linkedlist l1= "+l1);

	}

}
