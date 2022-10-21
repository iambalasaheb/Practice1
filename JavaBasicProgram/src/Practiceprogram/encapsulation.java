package Practiceprogram;
class DEMO{
	private long accno;
	//private string email;
	private float amount;
	//public getter and setter methods
	public long getaccno() {
		return accno;
	}
	//public string getemail() {
		//return email;
	//}
	public float getamount() {
		return amount;
	}
	//setter methods
	public void setaccno(long no) {
		System.out.println("iam getaccno method= "+no); 
		accno=no;
	}
	//public void setemail(string addr) {
	//	email=addr;
	//}
public void setamount(float A) {
	System.out.println("iam getaccno method= "+A); 

		amount=A;
	}
}
public class encapsulation {

	public static void main(String[] args) {
DEMO a1=new DEMO();
System.out.println("iam getaccno method= "+a1.getaccno()); 
System.out.println("iam getaccno method= "+a1.getamount()); 
a1.setaccno(12345);
a1.setamount(5000);
System.out.println("iam getaccno method= "+a1.getaccno()); 
System.out.println("iam getaccno method= "+a1.getamount()); 
	}

}
