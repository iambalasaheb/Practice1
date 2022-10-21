package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Arraylist2 {

	public static void main(String[] args) {
     ArrayList list=new ArrayList();
     list.add("Pune");
     list.add("Mumbai");
     list.add("Banglore");
     list.add("1234");
//size of list
     System.out.println("size of list= "+list.size());
     System.out.println("printing elements= "+list);
//by using for loop printing
     for(int i=0;i<list.size();i++) {
     System.out.println("using for loop= "+list.get(i));
     }
     //using for each loop
     for(Object a:list) {
     System.out.println("using for each= "+list.size());
     }//Acssesing the elements
     System.out.println("accses the element of 3 rd position= "+list.get(2));
//changing the element
     list.set(0,"Bhalgaon");
     System.out.println("size of list= "+list.size());
     System.out.println("elements of list= "+list);
//sorting the list
     Collections.sort(list);
  //by default it sort the passed collection element in assending order and
  //store it in the same collection
     System.out.println("size of list= "+list.size());
     System.out.println("elements of list= "+list);
     System.out.println("Traversing list through forEach() method:");
// The forEach() method is a new feature, introduced in Java 8.
     list.forEach(a ->{//by using lambda expression
         System.out.println(a); 
     });
     System.out.println("Traversing list through Iterator interface:");
		Iterator itr = list.iterator();
		/**
		 * List element: [1234,Banglore,Bhalgaon,Mumbai]
		 * Iterator is a Interface in collection, which is used to iterate collection elements
		 * Iterator interface has following method to iterate collection elements
		 * 1. hasNext() ---> boolean --> true next element is present, false no next element
		 * 2. next() ---> Object --> it will return next element from collection
		 * 3. remove() --> void --> element deletion
		 * Iterator object can be use to iterate a collection only once, for 2nd iteration create new Iterator object
		 */
//		System.out.println(itr.hasNext());//true
//		System.out.println(itr.next());//1234
//		System.out.println(itr.next());//Banglore
//		System.out.println(itr.next());//Bhalgaon
//		System.out.println(itr.next());//Mumbai
	//	System.out.println(itr.next());//NoSuchElementException exception
 // instead of writing above statement we can use while loop
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasNext());
	//by creating another iterator object and use while loop again
		Iterator itr1=list.iterator();
		while(itr1.hasNext()) {
	System.out.println(itr.next());

		}
	}

}
