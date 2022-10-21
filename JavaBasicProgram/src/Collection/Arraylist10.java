package Collection;
import java.util.List;
import java.util.ArrayList;
//import java.awt.font.NumericShaper;
public class Arraylist10 {

	public static void main(String[] args) {
          List<Integer> a1=new ArrayList<Integer>();
          a1.add(10);
          a1.add(25);
          a1.add(25);
          a1.add(20);
     	 System.out.println("size of the arraylist= "+a1.size());
     	 System.out.println("elements of the arraylist= "+a1);
         a1.removeIf(n ->(n%2==0));//we can remove the numbers which mod is equal to zero with this ststement
     	 System.out.println("elements of the arraylist= "+a1);
 
         }

	}


