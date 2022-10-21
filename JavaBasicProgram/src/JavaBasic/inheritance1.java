package JavaBasic;
class Fruits{
	int fruitage;
	Fruits(){
		System.out.println("i am ffruit constructor");
		fruitage=50;
	}
	public void teste() {
		System.out.println("i am teste method of fruits");
	}
}
class Apple extends Fruits {
	int fruitage;
	Apple(){
		System.out.println("i am Apple constructor");
		fruitage=20;
	}
	public void teste() {
		super.teste();//use when same methods available
		System.out.println("i am teste method of apple");

	}
	public void shape() {
		System.out.println("i am shape method");
		System.out.println("fruitage of Apple "+fruitage);
		System.out.println("fruitage of fruits "+super.fruitage);//super use when same name members available
	}
}
public class inheritance1 {

	public static void main(String[] args) {
Apple a1=new Apple();
		a1.teste();
		a1.shape();
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Fruits a2=new Fruits();
a2.teste();
System.out.println("fruitage of Fruits "+a2.fruitage);

	}

}
