package Collection;
import java.util.Queue;
import java.util.PriorityQueue;
public class Priorityqueue3 {

	public static void main(String[] args) {
     Queue q1=new PriorityQueue();
     System.out.println("size of the qoeue= "+q1.size());  
	 System.out.println("elements of the qoeue= "+q1);  
	//for empty queue using remove method shows exeption(i.e no such element exception)
	 System.out.println("elements of the qoeue= "+q1.remove());  
		//for empty queue using poll method shows null value
	 System.out.println("elements of the qoeue= "+q1.poll());  
	 System.out.println("elements of the qoeue= "+q1);  

	}

}
