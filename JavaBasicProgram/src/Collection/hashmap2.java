package Collection;
import java.util.HashMap;
import java.util.Map;

public class hashmap2 {

	public static void main(String[] args) {
    Map m=new HashMap();
     m.put("key1","Admin");//upcasting
     m.put("Key2","Admin");//upcasting
     m.put(null,"Admin123");//upcasting
     System.out.println("printing elements of map= "+m);
     System.out.println("printing size of map= "+m.size());
     m.put("key2", "Manager");
     m.put("1234", "Manager");
     m.put(null, "12345");//Boxing then upcasting
     System.out.println("after adding printing elements of map= "+m);
     System.out.println("after adding printing size of map= "+m.size());
     System.out.println("get the key value= "+m.get("key2"));//printing the selected key value only
     System.out.println("get the key set only= "+m.keySet());//printing the all of keys
     System.out.println("get the key values only= "+m.values());//printing the values of all the keys

     /**
      * to add any element in Map we need use put(key,value) 
      * toString() is overrided here as well
      * to get only keys from map use getKeys()
      * to get only values from Map use values()
      * if you want get a particular Key value dn use get(key)
      */ 
	}

}
