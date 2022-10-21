package Practiceprogram;

public class Practice6 {
 int rollno;
 float fee ;
 Practice6(int rollno, float fee){
System.out.println("loacal rollno="+rollno);
System.out.println("local fee="+fee);
System.out.println("global rollno="+this.rollno);
System.out.println("global rollno="+this.fee);
this.rollno=rollno;
this.fee=fee;
System.out.println("updated global rollno="+this.rollno);
System.out.println("updated global rollno="+this.fee);
System.out.println("loacal rollno="+rollno);
System.out.println(rollno+ " " +fee);



 }
 void display() {
		System.out.println("iam call method");
 }
public static void main(String[] args) {
	Practice6 e1=new Practice6(30,20000);
	e1.display();
	Practice6 e2=new Practice6(20,50000);
e2.display();
	
}
}