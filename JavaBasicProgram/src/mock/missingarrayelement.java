package mock;

public class missingarrayelement {
	public int findMissingEle(int inputArr[], int size)  
	{  
	     int sumOfEle = 0;  
	    int APSum = 0;  	    
	    APSum = ((size + 1) * (inputArr[0] + inputArr[size - 1])) / 2;  
	    for(int i = 0; i < size; i++)  
	    {  sumOfEle = sumOfEle + inputArr[i];  
	    }  
	    int missingEle = APSum - sumOfEle;  
	    return missingEle;  
	}  
	public static void main(String[] args) {
		int array[] = {3, 5, 7, 9, 11, 15, 17, 19};  
		missingarrayelement obj = new missingarrayelement();  
		int size = array.length;  
		int s = obj.findMissingEle(array, size);  
		System.out.println("For the input array: ");  
		for(int k = 0; k < size; k++)  
		{  
		    System.out.print(array[k] + " ");  
		}  
		System.out.println( );  
		System.out.println("The missing element is: " + s);  
		//System.out.println( "\n" );  
	}

}
