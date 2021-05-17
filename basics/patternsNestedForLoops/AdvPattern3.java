/*     *
 *    *  *
 *   *    *
 *  *      *
 * *        *
 *  *      * 
 *   *    *   
 *    *  *   
 *      *     
 *  123456789         
 *           */


package patternsNestedForLoops;

import java.util.Scanner;

public class AdvPattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n; j++) {
				if((i == 1 || i== n)&&(j == n/2 +1) ) {
					System.out.print("*");
				}else if(i == 1 || i== n){
					System.out.print(" ");
					
				}
				System.out.println();
			}
			

	}

}
	}
