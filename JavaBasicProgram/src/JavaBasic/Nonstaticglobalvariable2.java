package JavaBasic;

public class Nonstaticglobalvariable2 {
int age;
float grade=7.9f;
char name='B';
	public static void main(String[] args) {
	//syntax to declere the object;
	Nonstaticglobalvariable2 ref;
	//syntax to initilized object;
	ref=new Nonstaticglobalvariable2();
	System.out.println("program starts");
	System.out.println("the age of yogesh="+ref.age);
	System.out.println("the grade of b.e last year="+ref.grade);
	System.out.println("my name initial is="+ref.name);
	System.out.println("program ends");
ref.age=28;
ref.grade=9.0f;
ref.name='A';
System.out.println("program starts");
System.out.println("age="+ref.age);
System.out.println("grade="+ref.grade);
System.out.println("name="+ref.name);
System.out.println("program ends");
/*to create one more object 
 * syntax to declere object2*/
Nonstaticglobalvariable2 ref1;
//syntax to initilize object2;
ref1=new Nonstaticglobalvariable2();
System.out.println("program starts");
System.out.println("the age of yogesh="+ref1.age);
System.out.println("the grade of b.e last year="+ref1.grade);
System.out.println("my name initial is="+ref1.name);
System.out.println("program ends");
ref1.age=40;
ref1.grade=20.05f;
ref1.name='Z';
System.out.println("program starts");
System.out.println("the age of yogesh="+ref1.age);
System.out.println("the grade of b.e last year="+ref1.grade);
System.out.println("my name initial is="+ref1.name);
System.out.println("program ends");
	}

}
