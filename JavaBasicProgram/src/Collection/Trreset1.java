package Collection;
import java.util.TreeSet;
import java.util.Iterator;
public class Trreset1 {

	public static void main(String[] args) {
       TreeSet<String> t1=new TreeSet<String>();
	t1.add("Ravi");
	t1.add("VIjay");
	t1.add("Ajay");
	t1.add("Ravi");
	 System.out.println("elements of the treemap= "+t1);//duplicates not consider
	 System.out.println("elements of the treemap= "+t1.size());
	    System.out.println("_______________________________________________________________________");  
//by using iterator traversing the elements
	 Iterator<String> itr=t1.iterator();
	 while(itr.hasNext()) {
		 System.out.println("elements of the treemap= "+itr.next());
	 }
	    System.out.println("_______________________________________________________________________");  
	 //to print in decending oreder using iterator
	    Iterator i=t1.descendingIterator();
	    while(i.hasNext()) {
		System.out.println("elements of the treemap= "+i.next());
	    }
	    System.out.println("_______________________________________________________________________");  
	       TreeSet<Integer> t2=new TreeSet<Integer>();
       t2.add(15);
       t2.add(55);
       t2.add(70);
       t2.add(17);
       t2.add(102);
  	 System.out.println("elements of the treemap= "+t2);
  	 System.out.println("elements of the treemap= "+t2.pollFirst());//remove 1 element using method
  	 System.out.println("elements of the treemap= "+t2);
  	 System.out.println("elements of the treemap= "+t2.pollLast());//remove last element using method
  	 System.out.println("elements of the treemap= "+t2);
	    System.out.println("_______________________________________________________________________");  
     TreeSet<String> t3=new TreeSet<String>();
      t3.add("A");
      t3.add("B");
      t3.add("C");
      t3.add("D");
      t3.add("E");
      t3.add("F");
   	 System.out.println("elements of the treemap= "+t3);
   	 System.out.println("elements of the decending order= "+t3.descendingSet());//use decending method to reverse
   	 System.out.println("elements of the headset object= "+t3.headSet("C"));//IT shows elements before c only
   	 System.out.println("elements of the headset boolean= "+t3.headSet("C", true));//it shows inclusing c elements not after c
System.out.println("_______________________________________________________________________");  
	 System.out.println("elements of the subset= "+t3);
   	 System.out.println("elements of the subset= "+t3.subSet("C", "E"));//creating subset
   	 System.out.println("elements of the subset= "+t3.subSet("B",false, "E",true));//when write true it includes 
	 System.out.println("elements of the tailset= "+t3);
	 System.out.println("elements of the tailset= "+t3.tailSet("C"));
	 System.out.println("elements of the tailset= "+t3.tailSet("B",false));//B is not including cos false



	}

}
