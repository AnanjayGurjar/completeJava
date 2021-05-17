//Write a program to find a raised to the power b using loops, where a and b are given by the user


package loops;

import java.util.Scanner;

public class ForLoopsPower {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the number to which the base number is to be raised: ");
		int b = sc.nextInt();
		
		int result = 1;
		
		for (int i = 1; i<=b; i++) {
			
			result *= a;
			
		}
		System.out.println("The required result is: ");
		System.out.print(result);

	}

}
