package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Arraylist5 {

	public static void main(String[] args) {
    ArrayList<String> a1= new ArrayList<String>();
    //to check arraylist empty
    System.out.println("Is arraylist is empty= "+a1.isEmpty()); 
    a1.add("Ajay");//add method return type is boolean
    a1.add("Vijay");
    a1.add("Vivek");
    a1.add("Namdev");
   ArrayList<String> a2=new ArrayList<String>();
   a2.add("Ajay");
   a2.add("Hanumat");
   a2.add("Pune");
   System.out.println("arraylist 1= "+a1);
   System.out.println("arraylist 2= "+a2);
    //by using retain all its use for shows same type elements
   a1.retainAll(a2);
   System.out.println("arraylist 1= "+a1);
//Iteration the elements of a2 after retaining
   Iterator itr=a1.iterator();
   while(itr.hasNext()) {;//hasnext method  return type boolean
   System.out.println(itr.next());//return type is object
   }
   List s=new ArrayList();
    s.add("Pune");
    s.add("Pune");//add method parameter object form return type is boolean
    s.add("123");
    s.add("null");
    System.out.println("arraylist by refer List = "+s);
}
}