package Practiceprogram;

public class thiskeyword4 {
    int a;
    int b;     
    // Parameterized constructor
    thiskeyword4(int a, int b)
    {
        this.a = a;
        this.b = b;
    } 
    void display()
    {
        //Displaying value of variables a and b
        System.out.println("a = " + a + "  b = " + b);
    } 
    public static void main(String[] args)
    {
    	thiskeyword4 object = new thiskeyword4(10, 20);
    	System.out.println("+++++++++++++++++++++++++++++++++++");
        object.display();
        System.out.println(object.a+" "+object.b);//10 20
        System.out.println("+++++++++++++++++++++++++++++++++++");
        thiskeyword4 object2 = new thiskeyword4(102, 201);
        object2.display();
        System.out.println(object2.a+" "+object2.b);//102  201
    }
	}


