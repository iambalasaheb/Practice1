package Collection;
import java.util.TreeMap;
import java.util.Map;
public class Treemap1 {

	public static void main(String[] args) {
     Map m1=new TreeMap();
     m1.put(10,"Admin");//upcasting
     m1.put(11, "12345");//upcasting
     m1.put(12,"Admin");//upcasting
     m1.put(13,"Admin123");//upcasting
 	 System.out.println("elements of the map= "+m1.size());
 	 System.out.println("elements of the map= "+m1);

	}

}
