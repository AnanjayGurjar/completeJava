package userInput;

import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("type principal value here(in rupees) : ");
		
		int principal = sc.nextInt();
		
		System.out.println("type rate of interest here(in percentage) : ");
		
		float rate = sc.nextFloat();
		
		System.out.println("type time here(in years) : ");
		
		int time = sc.nextInt();
		
		double simpleInterest = principal*rate*time/100;
		
		System.out.println("the simple interest is " + simpleInterest);
		
		

	}

}
