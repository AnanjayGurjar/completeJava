/*Write a code to find the sum of series
 * 1+1/2+1/3+1/4+1/5+....... upto n terms,where n is given by the user*/
 


package loops;

import java.util.Scanner;

public class ForLoopsSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of terms here:");
		
		int n = sc.nextInt();
		double sum = 0;
		for (double i=1; i<=n; i++) {
			sum += 1/i;
			
		}
		System.out.println("The sum of the series is : ");
		System.out.println(sum);

	}

}
