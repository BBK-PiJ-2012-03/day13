public class mcCarthy {

	public static int mcCarthy91(int n) {
if (n > 100) {
return n - 10;
} else {
return (mcCarthy91(mcCarthy91(n+11)));
}
}

public static void main(String[] args) {
	
	int result = mcCarthy.mcCarthy91(26);
	System.out.println(result);
	}


}