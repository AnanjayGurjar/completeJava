//Write a program to print table of any number given by user
  
 
package loops;

import java.util.Scanner;

public class ForLoops4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of which table is required:");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(n*i);
		}

	}

}
