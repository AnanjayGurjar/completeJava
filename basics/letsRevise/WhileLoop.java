package letsRevise;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Program to find the sum of the digits of a number*/
		
//		int n = sc.nextInt();
//		int sum = 0;
//		
//		while(n>0) {
//			sum += n%10;
//			n = n/10;
//			
//		}
//		System.out.println(sum);
//		
		
		/*Program to find whether the given no is palindrome or not*/
		 
		System.out.println("Enter the number here:");
		int a = sc.nextInt();
		int temp = a;
		int reversedNumber = 0;
		while(temp>0) {
			int lastDigit = temp%10;
			reversedNumber = reversedNumber*10 + lastDigit;
			temp /= 10;
		}
		if(reversedNumber == a) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not a palindrome");
		}
		
	}

}
