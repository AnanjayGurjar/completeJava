package letsRevise;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Enter the first no here:");
		int firstNumber = sc.nextInt();
		
		System.out.println("Enter the second no here:");
		int secondNumber = sc.nextInt();
		
		System.out.println("Enter the operation here:");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		int result = 0;
		
		switch (operation) {
		case '+':
			result = firstNumber + secondNumber;
			break;
			
		case '-':
			result = firstNumber - secondNumber;
			break;
			
		case '*':
			result = firstNumber * secondNumber;
			break;
			
		case '/':
			result = firstNumber / secondNumber;
			break;
			
		}
		
		System.out.println("The required result is " + result);
			

	}

}
