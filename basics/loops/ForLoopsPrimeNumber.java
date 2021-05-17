/*Write a program to find whether the number given by the user is prime or not*/


package loops;

import java.util.Scanner;

public class ForLoopsPrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number here");
		
		int n = sc.nextInt();
		
		if (n==1) {
			System.out.println("The given number is prime no: false");
		}
		
		boolean result = true;
		
		for (int i = 2; i*i <= n; i++) {
			if (n%i==0) {
				result = false;
			}
			
			System.out.println("The given number is prime no:" + result);
			
		}
				
	}

}
