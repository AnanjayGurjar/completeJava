//Write a code to find which number is greatest among the three given numbers using ternary operators, where number is given by user


package conditionalStatements;

import java.util.Scanner;

public class TernaryOperators2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first number here:");
		
		int a = sc.nextInt();
		
		System.out.println("Enter second number here:");
		
		int b = sc.nextInt();
		
		System.out.println("Enter third number here");
		
		int c = sc.nextInt();
		
		int result = a>b ? a>c ? a:c: b>c ? b:c ;
		
		System.out.println("The greatest of three number is " + result);
		
				
		

	}

}
