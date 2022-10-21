package JavaBasic;

public class Method4 {
int age=30;
public void Disply() {
System.out.println("value of age="+age);
}
public void Display1(int a) {
	age=a;
System.out.println("value of age="+age);	
}
	public static void main(String[] args) {
	//need to create object for acces non-static global variables;
		Method4 f1=new Method4();
	System.out.println("value of age="+f1.age);
f1.Disply();
f1.Display1(50);
System.out.println("value of age="+f1.age);
Method4 f2=new Method4();
f2.Display1(25);
System.out.println("value of age="+f2.age);
f2.Disply();
System.out.println("value of age="+f2.age);

	}

}
