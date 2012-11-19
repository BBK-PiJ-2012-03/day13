public class HanoiTowers {

	public static double hanoi(int n) {
		if (n==1) {
			return 1;
		}
		
		double result = 2*(hanoi(n-1)) + 1;
		return result;
	}

public static void main(String[] args) {
	
	double result = HanoiTowers.hanoi(64); //not enough bits
	System.out.println(result);
	}	
}	