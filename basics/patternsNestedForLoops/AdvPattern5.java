/*         * * * * *
 *       *       *
 * 	   *       * 
 *   *       * 
 * * * * * * 	*/

package patternsNestedForLoops;

import java.util.Scanner;

public class AdvPattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<= n-i; j++) {
				System.out.print("  ");
				
			}
			if(i == 1 || i == n) {
				for(int j = 1; j<=n; j++) {
				System.out.print("* ");
				}
			}else {
				System.out.print("* ");
				for(int j = 1; j <n-1; j++) {
					System.out.print("  ");
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
