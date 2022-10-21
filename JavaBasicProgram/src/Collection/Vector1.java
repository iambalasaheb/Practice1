package Collection;
import java.util.Vector;
public class Vector1 {

	public static void main(String[] args) {
		Vector <String> v=new Vector<String>();
  //find out default capacity of vector
  System.out.println("Capacity of vector= "+v.capacity());
  System.out.println("Size of vector= "+v.size());
  v.setSize(2);
  System.out.println("Size of vector= "+v.size());//it shows declare size i.e 2
  System.out.println("elements of vector= "+v);//it shows the declare 2 element null null 
  v.add("Sunday");
  v.add("Monday");
  System.out.println("Size of vector= "+v.size());//it shows previous as wll as now declare size
  System.out.println("elements of vector= "+v);//it shows privious element i.e null null and sunday monday
      v.add("Saturday");
      System.out.println("Size of vector= "+v.size());//it shows 5 size
      System.out.println("elements of vector= "+v);//it shows all element which declared

	}

}
