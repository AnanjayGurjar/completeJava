//Write a program to find factorial of any number given by user


package loops;

import java.util.Scanner;

public class ForLoops5 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			long result = 1;
			
			System.out.println("Enter the number here:");
			
			int n = sc.nextInt();
			
			for(int i = 1; i <= n; i++) {
				
				result = result * i;
			}
			
			System.out.println(result);
				
		

	}

}
