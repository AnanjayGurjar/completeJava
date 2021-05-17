/*   *
 *   * *
 *   *   *
 *   *     *
 *   *       *
 *   *         *
 *   * * * * * * *
 */


package patternsNestedForLoops;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n here : ");
		
		int n = sc.nextInt();
		
		System.out.println("*");
		
		for(int j=2; j<=n-1;j++ ) {
			
			System.out.print("* ");
			
			for(int k = 1;k <= j-2;k++) {
				System.out.print("  ");
				
			}
			System.out.print("*");
			
			System.out.println();
		}
		
		
		for(int i=1; i<= n; i++) {
			System.out.print("* ");
		}
			
		

	}

}
