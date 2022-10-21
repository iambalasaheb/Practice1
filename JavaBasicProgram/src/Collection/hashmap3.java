package Collection;
import java.util.Map;
import java.util.HashMap;
public class hashmap3 {

	public static void main(String[] args) {
    Map m1=new HashMap();
    m1.put("key1","Admin");
    m1.put("key2","Admin");
    m1.put(null,"Admin123");
    System.out.println("printing elements of map= "+m1);
    System.out.println("printing elements of map= "+m1.size());
 //by creating new object
    Map m2=new HashMap();
    m2.put("a1","101");
    m2.put("a2","201");
    m2.put("a3","301");
    m2.put("key2","401");//when we use duplicate key dn duplicate key is not consider in elements 
    //but duplicate key value replace at the orignal key value
    System.out.println("printing elements of map= "+m2);
    System.out.println("printing elements of map= "+m2.size());
//adding all elements of m2 in m1
    m1.putAll(m2);
    System.out.println("printing elements of map= "+m1);
    System.out.println("printing elements of map= "+m1.size());

    /**
     * to add any element in Map we need use put(key,value) 
     * toString() is overrided here as well
     * to get only keys from map use getKeys()
     * to get only values from Map use values()
     * if you want get a particular Key value dn use get(key)
     */ 
	
	}

}
