//Write a program to print fibonacci series upto n terms starting from zero using recursion

package recursion;

import java.util.Scanner;

public class Recursion3 {
	
	static void fib(int n) {
		int a = 0;
		int b = 1;
		int c =  a + b;
		a = b;
		b = c;
		 System.out.print(a + " " + b + " " + c);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		

	}

}
