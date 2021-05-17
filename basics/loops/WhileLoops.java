// Write a program to find the sum of the digits of the number,where number is given by the user


package loops;

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number here : ");

		int number = sc.nextInt();
		
		int n = number;
		
		int sum = 0;
		
		while(n>0) {
		int	lastdigit = n%10;
			sum += lastdigit;
			n/=10;
		}
		System.out.println("The sum of the digit of " + number +" is " + sum);

	}

}
