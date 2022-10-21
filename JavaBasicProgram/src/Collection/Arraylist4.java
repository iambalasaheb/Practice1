package Collection;
import java.util.ArrayList;
public class Arraylist4 {

	public static void main(String[] args) {
/*     crating Generic arraylist object
		ArrayList<Integer> 1=new ArrayList<Integer>();//Generic
		1.add(10);
		ArrayList<Boolean> 2=new ArrayList<Boolean>();//Generic
		2.add(true);
		ArrayList<Character> 3=new ArrayList<Character>();//Generic
	   3.add('B');
	   by using generic way
*/	   
	ArrayList<String> a1=new ArrayList<String>();//Generic
     a1.add("Manoj");
     a1.add("Tushar");
     a1.add("Sagar");
     a1.add("Vivek");
     a1.add("Mauresh");
     System.out.println("printing all elements= "+a1); 
//remove the specific elements without position from arraylist
     System.out.println("remove elements= "+a1.remove("Tushar")); 
     System.out.println("after remove 1 elements= "+a1); 
//remove the specific elements with position from arraylist
     System.out.println("remove elements= "+a1.remove(0));
     System.out.println("after remove 1 elements= "+a1); 
     System.out.println("----------------------------------------- "); 
//creating another new object
		ArrayList<String> a2=new ArrayList<String>();//Generic
   a2.add("Rahul");
   a2.add("Subham");
   System.out.println("printing all elements= "+a2); 
   //adding a2 list elements in a1
   a1.addAll(a2);
   System.out.println("after adding a1 elements elements= "+a1); 
//removing all the elements from a1
   a1.removeAll(a2);
   System.out.println("after adding a1 elements elements= "+a1); 
//remove the elements on the basis of condition statement
//   if(a1.contains("Sagar")) {
//	   a1.remove("Sagar");
//   }  //or
   System.out.println("after condition remove a1 elements elements= "+a1); 
     //or by using another lambda equation
   a1.removeIf(str ->str.contains("Sagar"));
   System.out.println("after lambda remove a1 elements elements= "+a1); 
	   //remove all the elements available in the list by using clear
   a1.clear();
   System.out.println("after clear remove a1 elements elements= "+a1); 

	}

}
