package JavaBasic;

class Pune{
	void Deccan() {
		System.out.println("You are in Deccan");
	}
}
class Mumbai extends Pune {
	void Kurla() {
		System.out.println("You are in Kurla");
	}
}
public class typecasting2 extends Mumbai{
	void myCity() {
		System.out.println("You in city");
	}
	public static void main(String[] args) {
		typecasting2 a1=new typecasting2();//implisit upcasting
		a1.myCity();
		a1.Kurla();
		a1.Deccan();
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
        Mumbai a2=a1;//implicit upcasting
        //a2.myCity();
		a2.Kurla();
		a2.Deccan();
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
        Pune a3=a1;// or Pune a3=(pune)a1; or Pune a3=(pune) new typecasting2(); 
        //implicit upcasting or explicit or explicit upcasting
       // a3.myCity();
		//a3.Kurla();
		a3.Deccan();
	}

}
