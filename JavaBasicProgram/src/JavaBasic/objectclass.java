package JavaBasic;
class Object1{
	void display() {
		System.out.println("iam display method");
	}
}
public class objectclass extends Object1 {
static int lastrollno=100;
int rollno;
objectclass(){
	System.out.println("iam constructor");
	rollno=lastrollno;
	lastrollno++;
}
	public static void main(String[] args) {
Object a=new Object1();
System.out.println(a);
Object a1=new Object1();//or 
System.out.println(a1.hashCode());
System.out.println(a.toString());
objectclass a2=new objectclass();
System.out.println(a2.toString());
Object a3=new objectclass();
System.out.println(a3.hashCode());
System.out.println(a3.toString());
a2.display();
	}

}
