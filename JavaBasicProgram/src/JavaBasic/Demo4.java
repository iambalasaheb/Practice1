package JavaBasic;

public class Demo4 {

	
	static double degreeoffarhenheight(double degreecelcious) {
		double res=(degreecelcious*1.8)+32;
		System.out.println("program starts");
		System.out.println("total ="+degreecelcious);
return res;
	}
	public static void main(String[] args) {
		System.out.println("result="+Demo4.degreeoffarhenheight(35));
		System.out.println("result="+Demo4.degreeoffarhenheight(45));

		

	}

}
