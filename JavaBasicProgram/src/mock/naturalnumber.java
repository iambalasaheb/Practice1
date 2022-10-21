package mock;

public class naturalnumber {
	public static void main(String[] args) {
		//System.out.println(" "+natural(5));
		natural(6);
	}
//	 static int natural(int num) {
//			    int sum=0;
//			    for(int i=1;i<=num;i++) {
//			    	sum=sum+i;
//			    }
//			    return sum;
//			    }
	static void natural(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println(" "+sum);
	
	}
	}