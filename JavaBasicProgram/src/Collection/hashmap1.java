package Collection;
import java.util.HashMap;
import java.util.Map;
public class hashmap1 {

	public static void main(String[] args) {
      HashMap<Integer, String> map=new HashMap<Integer, String>();
      //in map instead of add we use put method for adding elements
      map.put(1,"Mango");
      map.put(2,"Apple");
      map.put(3,"Banana");
      map.put(4,"Dates");
      map.put(1,"Grapse");//traying to put duplicate key
	  System.out.println("printing the element= "+map);
//by using foreach loop
	  for(Map.Entry m:map.entrySet()) {
		     System.out.println("using foreach loop= "+m.getValue());
	  }//calling for get values only without keys
	 HashMap<Integer, String> map2=new HashMap<Integer, String>();
	 map2.put(101, "Ajay");
     map2.put(102, "Vijay");
	 map2.put(103, "Rahul");
	 System.out.println("printing the element= "+map2);
   for(Map.Entry n:map2.entrySet()) {
	     System.out.println("using foreach loop= "+n.getValue());
   }
     map2.putIfAbsent(104, "Gaurav");//method use for adding element
     System.out.println("printing after adding element= "+map2);
	 HashMap<Integer, String> map3=new HashMap<Integer, String>();
     map3.put(105, "Ravi");
     map3.putAll(map2);
	 System.out.println("printing the element= "+map3);
	 for(Map.Entry o:map3.entrySet()) {
	     System.out.println("using foreach loop= "+o.getValue());
   }
     System.out.println("initial elements of map3= "+map3);
//using keybased remove
     map3.remove(102);
     System.out.println("after keybased remove elements of map3= "+map3);
//using key value pair based remove
     map3.remove(101, "Ajay");
     System.out.println("after key value based remove elements of map3= "+map3);
map3.replace(103, "Gaurav");//using replace gaurav taking place at 105 in list and 
//existing element automatically removed
System.out.println("after key value based replace elements of map3= "+map3);
map3.replace(103, "Gaurav", "Vivek");
//by using this at same key we can replace only value by using this replace method
System.out.println("after key value based another method replace elements of map3= "+map3);
//by using foreach loop
for(Map.Entry p:map3.entrySet()) {
    System.out.println("using foreach loop= "+p.getValue());

}
	}

}
