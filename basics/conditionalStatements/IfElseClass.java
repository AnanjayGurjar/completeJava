package conditionalStatements;

import java.util.Scanner;

public class IfElseClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type your age here:");
		
	    double age = sc.nextDouble();
		
		if (age >= 18) {
			System.out.println("You can vote now");
		}if (age > 0 && age < 18) {
			System.out.println("Only person above 18 can vote");
		}else {
			System.out.println("Invalid input");
		}

	}

}
