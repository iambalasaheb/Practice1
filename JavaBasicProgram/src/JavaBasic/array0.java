package JavaBasic;
import java.util.Arrays;
public class array0 {

	public static void main(String[] args) {
		// declaring a source array
				char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
				// declaring a destination array
				char[] copyTo=Arrays.copyOf(copyFrom, copyFrom.length);
				for(int i=0;i<copyTo.length;i++) {
					System.out.println(copyTo[i]);
				}
				System.out.println("************Copy using range****************");
				char[] copyWithRange=Arrays.copyOfRange(copyFrom, 3, copyFrom.length);
				for(int i=0;i<copyWithRange.length;i++) {
					System.out.println(copyWithRange[i]);
				}
				System.out.println("****************After Sorting********************");
				Arrays.sort(copyWithRange);
				for(char c: copyWithRange) {
					System.out.println(c);
				}
	}

}
