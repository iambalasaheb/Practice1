package Collection;
import java.util.Queue;
import java.util.PriorityQueue;
public class Priorityqueue2 {

	public static void main(String[] args) {
	  Queue q=new PriorityQueue();
	  //size of the queue
	  System.out.println("size of the qoeue= "+q.size());  
	  System.out.println("elements of the qoeue= "+q);  
//for empty queue using element method shows exeption(i.e no such element exception)
	  System.out.println("size os the qoeue= "+q.element());  
	//for empty queue using peack method shows null value 
	  System.out.println("size os the qoeue= "+q.peek());  
	  System.out.println("elements of the qoeue= "+q);  

	}

}
