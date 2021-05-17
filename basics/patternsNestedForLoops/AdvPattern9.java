/*     1
 *    1 1
 *   1 2 1
 *  1 3 3 1
 * 1 4 6 4 1
 * */

package patternsNestedForLoops;

import java.util.Scanner;

public class AdvPattern9 {
	
static int factorial(int a) {
		int fact = 1;
		for(int i = 1; i <= a; i++) {
			fact *= i;
		}
		return fact;
		
	}
static int nCr(int a, int b) {
		int ans = factorial(a)/(factorial(b)*factorial(a-b));
		return ans;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j = 0;j <=i; j++) {
				System.out.print(nCr(i,j) + " ");
			}
			System.out.println();
		}

	}	

}

