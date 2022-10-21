package JavaBasic;
 class encapsuldemo {
	private int empID=1000;
	private double salary =45000;
	//get value of private varibales
	public int getEmpId() {
		return empID;
	}
	public double getSalary() {
		return salary;
	}
	//set value for private variable
	public void setEmpId(int id) {
		empID=id;
	}
	public void setSalary(double sal) {
		salary=sal;
	}
}
public class encapsulation1 {

	public static void main(String[] args) {
		
		encapsuldemo d1=new encapsuldemo();
		//System.out.println(d1.empID);// compile time error
		//System.out.println(d1.salary);// compile time error
		System.out.println(d1.getEmpId());
		System.out.println(d1.getSalary());
		double updatedSalary=d1.getSalary()+14000;
		System.out.println("Updated salary: "+updatedSalary);
		System.out.println(d1.getSalary());
		System.out.println("********************************");
		d1.setEmpId(1223);
		d1.setSalary(55000);
		System.out.println(d1.getEmpId());
		System.out.println(d1.getSalary());
	}

	
}
