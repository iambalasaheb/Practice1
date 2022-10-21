package Collection;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;
public class Priorityqueue1 {

	public static void main(String[] args) {
    Queue q1=new PriorityQueue();//creating object of Priority queue
    //while added element in queue it will place smallest element at the top allways
    q1.add(123);
    q1.add(120);
    q1.add(240);
    q1.add(50);
    q1.add(1);
    q1.add(25);
    System.out.println("size of elements of Queue= "+q1.size());
    System.out.println("printing the of elements of Queue= "+q1);
    System.out.println("_______________________________________________________________________");  
  //element() returns top most element of the queue, if the queue if empty dn it
 //will throw an exception by name 'NoSuchElementException'
    System.out.println("head elements of Queue= "+q1.element());//using element method
 // peek() returns top most element of the queue, if the queue if empty dn it
 // will return 'null' instead of throwing exception
    System.out.println("head elements of Queue= "+q1.peek());//using peek method
    System.out.println("_______________________________________________________________________");  
    //printing queue element using for each loop
    System.out.println("by using for each loop");
    for(Object a:q1) {
      System.out.println(a);
    }
    System.out.println("_______________________________________________________________________");  
    System.out.println("iterating the queue elements using iterator");
    Iterator itr=q1.iterator();
    while(itr.hasNext()) {
        System.out.println(itr.next());
    }
    System.out.println("printing the of elements of Queue= "+q1);
    System.out.println("_______________________________________________________________________");  
 // it will remove top most element of the Queue, if the queue is empty dn it
 // will throw an exception by name 'NoSuchElementException'
    System.out.println("after remove method the of elements of Queue= "+q1.remove());//remove top level element
    System.out.println("printing the of elements of Queue= "+q1);
    System.out.println("_______________________________________________________________________");  
 // it will remove top most element of the Queue, if the queue is empty dn it
 // will return 'null' value
    System.out.println("after remove method the of elements of Queue= "+q1.poll());//remove top level element
    System.out.println("printing the of elements of Queue= "+q1);
//after removing 2 elements from queue
    System.out.println("_______________________________________________________________________");  
    Iterator itr1=q1.iterator();
while(itr1.hasNext()) {
    System.out.println(itr1.next());
}
System.out.println("_______________________________________________________________________");  
//using lamda equation
  q1.forEach(b ->{
      System.out.println(b);  
  });
    
	}

}
