package Assignments;

public class Vovelsorconsonant {
public static void Vovelsorconsonant1(char c) {
	if (c=='a' ||c=='e'||c=='i'||c=='o'||c=='u'){
		System.out.println("this letter is vowel"); 
	}
	else {
		System.out.println("this letter is consonant"); 
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vovelsorconsonant1('a');
		Vovelsorconsonant1('b');
		Vovelsorconsonant1('c');
		Vovelsorconsonant1('d');
		Vovelsorconsonant1('e');
	}

}
