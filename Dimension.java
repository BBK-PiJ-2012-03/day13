public class Dimension {
	int w; 
	int h;

  public Dimension size (String name) {
	if (name.equals("0") {
		return new Dimension(1500,700); // A0
	}

	else if (name.charAt(0) == '0)') {
		Dimension smallD = size(name.substring(1,name.lenght());
		return new Dimension(smallD.h*2,smallD.w);
	}
	
	else {
			int bigger = Integer.parseInt(name) - 1;
			Dimension bigD = size("" + bigger);
			return new Dimension(bigD.h,bigD.w/2);
		}
  }
}		
			
		
