package JavaBasic;
class encapsulation {
	 
private int ssn;
private String empName;
private int empAge;
// Getter and Setter methods
public void getEmpSSN() {
	System.out.println(ssn);
}
public String getEmpName() {
	return empName;
}
public int getEmpAge() {
	return empAge;
}
public void setEmpAge(int newValue) {
	this.empAge = newValue;
}
public void setEmpName(String newValue) {
	this.empName = newValue;
}
public void setEmpSSN(int newValue) {
	this.ssn = newValue;
}
}
class encapsul {

public static void main(String args[]) {
	encapsulation obj = new encapsulation();
	
	System.out.println("Employee Name: " + obj.getEmpName());
	//System.out.println("Employee SSN: " + obj.getEmpSSN());
	System.out.println("Employee Age: " + obj.getEmpAge());
	System.out.println("**************************************");
	obj.setEmpName("Mario");
	obj.setEmpAge(32);
	obj.setEmpSSN(112233);
	//System.out.println("Employee Name: " + obj.getEmpName());
	//System.out.println("Employee SSN: " + obj.getEmpSSN());
	//System.out.println("Employee Age: " + obj.getEmpAge());
}
	}


