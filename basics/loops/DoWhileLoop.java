// Write a program which take user input and terminates as soon as user enter '0'


package loops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			 n = sc.nextInt();
			
			System.out.println("the number is "+ n);
		}while (n !=0);
		
		
		

	}

}
