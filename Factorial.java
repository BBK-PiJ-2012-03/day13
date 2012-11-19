public class Factorial {
	
  private static int[] myArray = null;

	public static int factorial(int n) {
		int result = 1;
		myArray = new int[n+1];
		
		for (int i=1 ; i <= n ; i++) {			
			myArray[i] = i;
		}
		
		for (int j=1 ; j <= n ; j++) {
			result = result * myArray[j];
		}
		
		return result;	
	}


	public static void main(String[] args) {
	
	int result = Factorial.factorial(5);
	System.out.println(result);
	}	
}	
