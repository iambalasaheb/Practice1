package Collection;
import java.util.Vector;
public class Vector3 {

	public static void main(String[] args) {
            Vector<String> v2=new Vector<String>();
            //to check default capacity of vector
         System.out.println("Capacity of vector= "+v2.capacity());

            v2.add("Vivek");
            v2.add("Manoj");
            v2.add("Rahul");
            v2.add("Mayuresh");
            v2.add("Subham");
            v2.add("Digvijay");
            v2.add("Ron");
            v2.add("Anuj");
            v2.add("Anurag");
            v2.add("Tushar");
       System.out.println("elements of vector= "+v2);
       v2.addElement("Yogesh");
       System.out.println("elements of vector= "+v2);
       System.out.println("Capacity of vector= "+v2.capacity());
	 System.out.println("_______________________________________________________________________");  
   //using foreach loop
	 for(String a:v2) {
	       System.out.println(a);
	 }

	}

}
