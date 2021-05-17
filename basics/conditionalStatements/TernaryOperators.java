//Write a code to find which number is greatest among the three given numbers using ternary operator


package conditionalStatements;

public class TernaryOperators {

	public static void main(String[] args) {
		
		int a = 14;
		int b = 9;
		int c = 18;
		
		int result = a>b ? a>c ? a:c:b>c ? b:c;
		
		System.out.println("The greatest of three numbers is " + result);
		

	}

}
