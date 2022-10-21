package Array2;

public class example3 {
//left rotation
	public static void main(String[] args) {
int array[]= {10,20,30,40,50,60,70,80,90};
int n=3;
for(int i=0;i<array.length;i++) {
	System.out.print(array[i]+ " ");
}
System.out.println();
for(int i=0;i<n;i++) {
	int first=array[0],j;
	for(j=0;j<array.length-1;j++) {
		array[j]=array[j+1];
	}
	array[j]=first;
	System.out.println();
}
for(int i=0;i<array.length;i++) {
	System.out.print(array[i]+ " ");
}
System.out.println();

		}

}
