package Assignments;

public class Multiplicationfloat {
private static float Multi(float n1, float n2) {
	float result=n1*n2;	
	System.out.println("Multiplication of 2 numbers="+result);
	return result;
}
	public static void main(String[] args) {
		System.out.println("program starts");
		//write using main directly
		//float n1=5; float n2=4;
		//float result=n1*n2;
		//System.out.println("program ends="+result);

		//by using dirct call method
		Multi(9,20);
		//by using class name
		Multiplicationfloat.Multi(90, 95);
		
		System.out.println("program ends");

	}

}
