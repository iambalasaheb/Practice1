package Collection;

public class Arraylist8 {

	public static void main(String[] args) {
    Arraylist8 a1=new Arraylist8();
    //consider arraylist class as garbage collector
    System.out.println("adress of GC= "+a1.hashCode());
  //hashCode method for address calling of GC
    a1=null;
    System.gc();
	}
	@Override
	protected void finalize(){
	     System.out.println("iam finalize method");

	}
}
/**
why finalize: release system resources before the garbage collector runs for specific object

*/