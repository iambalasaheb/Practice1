package Collection;
import java.util.ArrayList;
import java.util.List;
public class Arraylist9 {

	public static void main(String[] args) {
  //creating object of arraylist class
		ArrayList a1=new ArrayList();
// creating an object of ArrayList and upcasting it to List interface
    List a2=new ArrayList();
	/*String class object convertion into Object class object*/
//	String s1=new String("Demo");
//	Object obj=s1;
//	Object obj1=(Object)s1;
  //In collection we can store only Object class object
  		a1.add("Pune");// String object "Pune" will be upcasting to Object class object
  		// int will be boxed(wrapper class) to Integer class object and dn that object will be upcasted to Object class object
  		a1.add(123);// first auto boxing operation dn up-casting to Object class object
  		/**
  		 * java compiler will perform below action at compile time
  		 	Integer intobj=new Integer(123);//boxing operation to get Integer class object
  			Object obj4=intobj;// auto-upcasting Integer class object to Object class object
  		 */
  		a1.add(true);//auto boxing and dn auto-upcasting
		a1.add(null);
		a1.add("Pune");
		System.out.println("size of list: "+a1.size());
		System.out.println("Elements of list: "+a1);		
		a1.add(1, "Mumbai");
		System.out.println("size of list: "+a1.size());
		System.out.println("Elements of list: "+a1);
		
		System.out.println("index specific element: "+a1.get(2));
		/*printing one by one element of an ArrayList using for loop*/
		for(int i=0;i<a1.size();i++) {
			System.out.println("Element at index: "+i+": "+a1.get(i));
		}
		//by using for each loop
		for(Object a:a1) {
			System.out.println("for each loop Elements of list: "+a);

		}
    
	}

}
