/*Find the sum of the series'
 * 1-1/2+1/3-1/4+1/5-.......upto n terms,where n is given by the user*/

package loops;

import java.util.Scanner;

public class ForLoopsSum2 {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number of terms here: ");
		
		int n = sc.nextInt();
		
		float sum = 0;
		for(float i=1; i<=n;i++) {
			
			if(i%2==0) {
				sum -= 1/i;
			}else {
				sum += 1/i;
			}
		}
		System.out.println("The required result is:");
				System.out.println(sum);
				
	}

}
