package JavaBasic;

public class builderclass {

	public static void main(String[] args) {
		StringBuilder a1=new StringBuilder("hello");
		a1.append("Java");
		System.out.println(a1);
		a1.reverse();
		System.out.println(a1);
		StringBuilder a2=new StringBuilder("hello java");
		System.out.println(a2);
		StringBuilder a3=new StringBuilder("hello java");
		System.out.println(a3);
		System.out.println(a2.equals(a3));//adress basis comparision
		System.out.println(a2==a3);//adress basis comparision
		//We don't have any method in StringBuffer and StringBuilder to compare object values, so to
		//overcome that first convert StringBuffer/StringBuilder to String class using 
		//toString() dn use equals() of string class
		System.out.println((a2.toString().equals(a3.toString())));




	}

}
