package Practiceprogram;

public class thiskeyword5 {
	static int empid=12345;
      int age;
      double salary;
      thiskeyword5(){
    	  System.out.println("iam thiskeyword5 class constructor ");
    	  age=15;        //initialization of NSGV in constructor
    	  salary=15000;
      }
      void display() {
    	  System.out.println("iam display method "); 
      }
      void teste() {
    	  System.out.println("iam 0 para taste method "); 
      }
      void teste(int age, double salary) {
    	  System.out.println("iam 1para taste method "); 
    	  System.out.println("iam 1para taste age= "+age); 
    	  System.out.println("iam 1para taste NSGV salary= "+salary); 
    	  System.out.println("iam 1para taste NSGV age= "+this.age);//diferanceating  NSGV by this
    	  System.out.println("iam 1para taste NSGV salary= "+this.salary); 
          this.teste();//calling method by using this in current class
          this.display();//calling method by using this in current class
      }
	public static void main(String[] args) {
  	  System.out.println("iam static global empid= "+empid); 
  	thiskeyword5 a1=new thiskeyword5();
  	a1.teste();
  	a1.teste(29,70000);
	System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
  	thiskeyword5 a2=new thiskeyword5();
	System.out.println("iam NSGV age= "+a2.age); 
	System.out.println("iam NSGV salary= "+a2.salary); 
	/**
	 * 
	 * this ----> keyword --> used for non-static variable/method 
	 * this()---> statement ---> used for constructor
	 * this(): used to call another constructor of current class based on its argument
	 * this(): should be the first statement inside the constructor body
	 */
	}

}
