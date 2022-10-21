package JavaBasic;

public class singleton {

	private singleton() {
		System.out.println("I am zero-param");
	}
	private static singleton d1=new singleton();
	String name="Pune";
	static singleton getInstance() {
		return d1;
	}
	 void print() {
		 System.out.println("I am print() of Singleton class Demo1223 ");
	 }
}
class SingletonClass2 {

	public static void main(String[] args) {
		//singleton d1=new singleton();//compile time error due to singleton class concept
				//or
		singleton xyz=singleton.getInstance();//d1--->new singleton();
		xyz.print();
		System.out.println(xyz.name);//Pune
		xyz.name="Bangalore";
		System.out.println("d1 ref: "+xyz.name);//Bangalore
		singleton d2=singleton.getInstance();
		System.out.println("d2 ref: "+d2.name);//Bangalore
	}
}