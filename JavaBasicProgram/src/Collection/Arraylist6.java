package Collection;
import java.util.ArrayList;
import java.util.List;
class Book{
	int id;
	String name, Author,Publisher;
	int quantity;
	public Book(int id, String name,String Author,String Publisher,int quantity) {
		this.id=id;
		this.name=name;
		this.Author=Author;
		this.Publisher=Publisher;
		this.quantity=quantity;
			}
}
public class Arraylist6 {

	public static void main(String[] args) {
      //creating list of book
		List<Book> list=new ArrayList<Book>();//generic
		//crating books
		Book b1=new Book(101,"balasaheb","Exel","Goal",10);
		Book b2=new Book(201,"balasaheb2","Exel2","Goal2",20);
		Book b3=new Book(301,"balasaheb3","Exel3","Goal3",30);//add new element like this also
      //adding books to the List interface
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(new Book(401,"balasaheb4","Exel4","Goal",40));
		System.out.println("print the elements "+list);
		System.out.println("print the perticular elements= "+list.get(1).Author);
//by using for each loop
		for(Book a1:list) {
System.out.println(a1.id + " " + a1.name + " " + a1.Author + " " + a1.Publisher + " " + a1.quantity);

		}
	}

}
