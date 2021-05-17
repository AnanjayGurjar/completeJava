//Write a program to find the sum of numbers upto n,where n is given by user


package loops;

import java.util.Scanner;

public class ForLoops3 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		System.out.println("Enter the number here:");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			sum = sum + i;
			
		}
		
		System.out.println(sum);		
		

}
	
}
