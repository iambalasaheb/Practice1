package JavaBasic;

public class Demo5 {

	static double areaofcircle(double r) {
		double pai=3.14;
		double area=(3.14*r*r);
		System.out.println("program starts");
		System.out.println("the value of pie reference="+pai);

		System.out.println("area of cirle="+area);

		return area;
	}
	public static void main(String[] args) {
	Demo5.areaofcircle(5);
	System.out.println("******************************");
	Demo5.areaofcircle(25);
	System.out.println("the value of pie reference=");

	}

}
