package Collection;
import java.util.Set;
import java.util.Iterator;
import java.util.HashSet;
public class Set1 {

	public static void main(String[] args) {
//creating hashset method and adding element
		Set<String> s=new HashSet<String>();
		// in set if you try to add duplicate element dn it will neglect that element
				// instead of throwing an error
        s.add("Ravi");
        s.add("Vijay");
        s.add("Ajay");
        s.add("Ravi");//it dont get added in the set
  	  System.out.println("printing the size of set = "+s.size());
	  System.out.println("printing the element= "+s);
	  //traversing the elements
	  Iterator itr= s.iterator();
    while(itr.hasNext()) {
  	  System.out.println("printing the element= "+itr.next());
    }
	  System.out.println("removing ravi from the set= "+s.remove("Ravi"));//boolean type
	  System.out.println("after remove ravi from s printing the element= "+s);
		Set<String> s1=new HashSet<String>();
      s1.add("Gaurav");
      s1.add("Vivek");
	  System.out.println("printing the element of s1= "+s1);
      s.addAll(s1);
      //adding all elements of s1 in s
	  System.out.println("after adding s1 in s printing the element s= "+s);
	  //removing all elements of s1 from s
      s.removeAll(s1);
	  System.out.println("after removing s1 printing the element of s= "+s);
//removing elements on the basis of specified condition
	  s.removeIf(str ->str.contains("Vijay"));
	  System.out.println("after condition the element of s= "+s);
	  //removing all the elements available in set
      s.removeAll(s);
	  System.out.println("after remove all the element of s= "+s);

	}

}
