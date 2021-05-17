/*  		*
 *        * * *
 *      * * * * *
 *    * * * * * * *
 *      * * * * *
 *        * * *
 *          *
 * 
 * */

package patternsNestedForLoops;

import java.util.Scanner;

public class AdvPattern2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int n = rows/2 + 1;
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<= n-i; j++) {
				System.out.print("  ");
			}
			for(int j = 1;j<= i*2 - 1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 1; i<= n -1; i++) {
			for(int j = 1;j <= i; j++) {
				System.out.print("  ");
			}
			for(int k =1; k<= rows - 2*i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
