public class Fibonacci {
	private static int[] precalculated = null;
	
	public static int fib(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			int result = fib(n-1) + fib(n-2);
			return result;
		}
	}

	public static int fibPrecalc(int n) {
		if (precalculated == null) {
			initPrecalculatedArray(n);
		}
		if (precalculated[n-1] != -1) {
			return precalculated[n-1];
		} else {
			int result = fibPrecalc(n-1) + fibPrecalc(n-2);
			precalculated[n-1] = result;
			return result;
		}
	}

	private static void initPrecalculatedArray(int size) {
		precalculated = new int[size];
		for (int i = 0; i < precalculated.length; i++) {
			precalculated[i] = -1; // to indicate "not calculated yet"
		}
		precalculated[0] = 1; // F(1)
		precalculated[1] = 1; // F(2)
	}

	public static void main(String[] args) {
		double initTime1 = System.currentTimeMillis();
		int result = Fibonacci.fib(45);
		System.out.println(result);
		double totalTime1 = System.currentTimeMillis() - initTime1;
		System.out.println(totalTime1);
		
		
	
		double initTime2 = System.currentTimeMillis();
		int result2 = Fibonacci.fibPrecalc(40);
		System.out.println(result);
		double totalTime2 = System.currentTimeMillis() - initTime2;
		System.out.println(totalTime2);
		
	
	
	
	
	
	}
	
	
}

	