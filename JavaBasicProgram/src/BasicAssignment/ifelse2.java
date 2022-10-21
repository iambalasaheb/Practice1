package BasicAssignment;

public class ifelse2 {
	// checking weather an alphabets are vowel or consonants using if else
	//by creating method
  static void check(char i) {
	  if(i=='a'||i=='e'||i=='i'|| i=='o'|| i=='u') {
	System.out.println("Given char is vowel");  
		}
		else {
	 System.out.println("Given char is consonant");  
		}
	}
	public static void main(String[] args) {
		check('z');
		check('o');

	//or we can do this way also
	// checking weather an alphabets are vowel or consonants using if else
	//char i='a';
//		if(i=='a'||i=='e'||i=='i'|| i=='o'|| i=='u') {
//	        System.out.println("Given char is vowel");  
//		}
//		else {
//	        System.out.println("Given char is consonant");  
//		}
	}

}
