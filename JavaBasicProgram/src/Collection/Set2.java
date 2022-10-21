package Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;

public class Set2 {

	public static void main(String[] args) {

		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Vivek");
		arr.add("Ajay");
		arr.add("Vijay");
		arr.add("Vivek");
		System.out.println("size of arraylist= "+arr.size());
		System.out.println("elements of arraylist= "+arr);
         HashSet<String> hs=new HashSet<String>();
 		System.out.println("elements of set= "+hs);
         hs.add("Anuj");
  		System.out.println("elements of set= "+hs);
       Iterator itr=hs.iterator();
       while(itr.hasNext()) {
 		System.out.println("elements of set by using while= "+itr.next());
	}
       //using for each
       hs.forEach(s1 ->{
     		System.out.println("using foreach= "+s1);
       });
       hs.removeIf(s1 ->s1.contains("Anuj"));
 		System.out.println("after remove if elements of set= "+hs);

	}
}
