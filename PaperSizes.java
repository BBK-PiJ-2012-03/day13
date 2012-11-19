public class PaperSizes {

	public static void calcSize(String input) {
		String realDeal = input.substring(1);
		
		if (realDeal.length() == 1) { //In this situation its a paper smaller than A0
			calcSizeDesc(realDeal);
		}
		else {  //In this situation its a paper bigger than A0
		calcSizeAsc(realDeal);
		}
	}
	
	public static int calcSizeDesc(String input) {  
		System.out.println("1");
		return 0;
	}
	
	public static int calcSizeAsc(String input) {
		System.out.println("2");
		return 0;
	}

	

	public static void main(String[] args) {
		PaperSizes.calcSize("A000");
		PaperSizes.calcSize("A4");
	}	
}