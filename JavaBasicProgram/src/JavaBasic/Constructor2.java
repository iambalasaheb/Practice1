package JavaBasic;

public class Constructor2 {
	int roll;
	double salary;
	Constructor2(int r,double s){
		roll=r;
		salary=s;
	}
	void display() {
		System.out.println(roll);
		System.out.println(salary);

	}
	public static void main(String args[]) {
		Constructor2 c1 = new Constructor2(101,250045.45);
		c1.display();
		Constructor2 c2 = new Constructor2(201,550045.45);		
		c2.display();
	}
}