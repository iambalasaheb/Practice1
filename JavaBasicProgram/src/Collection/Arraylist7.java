package Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Arraylist7 {

	public static void main(String[] args) {
//Generic: with the help of generic we can force collection to store similar type of data
     List<Integer> a1=new ArrayList<Integer>();
     a1.add(60);
     a1.add(40);
     a1.add(30);
     a1.add(10);
     a1.add(50);
     System.out.println("size of list= "+a1.size());//no.of element
     System.out.println("elements of list= "+a1);//list of the element
     System.out.println("position elements of list= "+a1.get(2));
   Collections.sort(a1);//use to place ascending order
   System.out.println(" sorted elements of list= "+a1);
   Collections.reverse(a1);//use to reverse elements
   System.out.println(" reverse sorted elements of list= "+a1);

	}

}
