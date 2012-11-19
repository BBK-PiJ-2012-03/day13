public class ex1 {


public static void printNumbers(int n) {
if (n <= 0) {
return;
}
System.out.println(n);
printNumbers(n-2);
printNumbers(n-3);
System.out.println(n);
}

public static void main(String[] args) {
	
	ex1.printNumbers(6);
	}


}
/**
6
4
2
2
1
1
4
3
1
1
3
6
*/
