//if a function call itself then it is known as recursion. for example in this case we will see
// the case of factorial 

package recursion;

import java.util.Scanner;

public class Recursion {
	
	static int factorial (int n) {
		if (n==0 || n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number here:");
		int n = sc.nextInt();
		
		System.out.println("The value of factorial of " + n + " is " + factorial(n));
		

	}

}
