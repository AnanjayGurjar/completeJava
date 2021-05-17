//Write a program to find sum of n natural number using recursion

package recursion;

import java.util.Scanner;

public class Recursion2 {
	
	static int sum(int n) {
		if (n == 1) {
			return 1;
		}else {
			return n + sum(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number upto which sum is required : ");
		int n = sc.nextInt();
		
		int result = sum(n);
		
		System.out.println("The required result is " + result);
		

	}

}

