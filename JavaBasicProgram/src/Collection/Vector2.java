package Collection;
import java.util.Vector;
public class Vector2 {

	public static void main(String[] args) {
     Vector<String> v1=new Vector<String>();
//default capacity is 10, its capacity gets increase by 100% of its size
     //adding elements by using add methods
       v1.add("Tiger");  
       v1.add("Lion");  
       v1.add("Dog");  
       v1.add("Elephant");  
       //adding elements by using element method of vector
       v1.addElement("Rat");
       v1.addElement("Cat");
       v1.addElement("Deer");
       System.out.println("Size of vector= "+v1.size());
       System.out.println("elements of vector= "+v1);
	    System.out.println("_______________________________________________________________________");  
//by using for each loop
	    for(String a:v1) {
	        System.out.println(a);
	    }
	}

}
/**
Synchronized --> Thread Safe ----> slow
default capacity-->10 --> increases capacity by 100%
Vector comes from JDK 1.0 ---> also known as legacy class
*/
