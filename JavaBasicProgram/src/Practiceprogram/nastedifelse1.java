package Practiceprogram;

public class nastedifelse1 {

	public static void main(String[] args) {
int age=19,weight=60;
if(age>=19) {
	System.out.println("persion age="+age);
	if(weight<=60) {
		System.out.println("persion eligible for blood donation");
	}else {
		System.out.println("persion is not eligible for blood donation becouse weigtht is less");
	}
}else  {
	System.out.println("age must be grater than 19 ");

}
	}

}
