package switchCase;

import java.util.Scanner;

public class BuidingCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the first number here:");
//		
//		double a = sc.nextDouble();
//		
//		System.out.println("Enter the second numer here:");
//		
//		double b = sc.nextDouble();
//		
//		System.out.println("Enter Operarion here:");
//		
//		sc.nextLine(); //if not used it will consider 'enter' as its input,hence will give error
//		
//		char operation = sc.nextLine().charAt(0); //sc.nextChar() is invalid,so we use string to store single character
//		
//		double result = 0;
//		
//		switch (operation) {
//		
//		case '+' :
//			 result = a + b;
//			break;
//			
//		case '-':
//			 result = a - b;
//			break;
//			
//		case '*' :
//			 result = a*b;
//			break;
//			
//		case '/' :
//			 result = a/b;
//			break;
//			
//		case '%' :
//			result = a*b/100;
//			break;
//			
//			default :
//				System.out.println("invalid operation");
//			
//			
//		}
//		System.out.println("The result is " + result);
		
		System.out.println("Enter the year");
		int year = sc.nextInt();
		
		System.out.println("Enter the month");
		int years = sc.nextInt();
		
		switch(years) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("No. of days is 31");
			break;
			
		case 2:
			if(year%4==0) {
			System.out.println("No. of days is 29");
			}else {
				System.out.println("no. of days is 28");
			}
			
			break;
			
			default:
				System.out.println("no of days is 30");
				break;
		}
			
			
		
		
		}

	}


