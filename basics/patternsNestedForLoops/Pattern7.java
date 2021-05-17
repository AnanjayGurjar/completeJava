/*           1
 *         2   3
 *       4   5   6
 *     7   8   9   10
 */


package patternsNestedForLoops;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of terms here: ");
		
		int n = sc.nextInt();
		
		int number = 1;
		
		for(int j = 1; j<=n;j++) {
			for(int i = 1; i<=n-j;i++) {
				System.out.print("  ");
			}
			for(int k = 1;k<= j; k++) {
				System.out.print(number++ + "   ");
			}
			System.out.println();
		}

	}

}
