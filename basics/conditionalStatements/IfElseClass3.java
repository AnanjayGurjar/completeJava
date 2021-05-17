//write a code to find where the number lies, where number is given by the user




package conditionalStatements;

import java.util.Scanner;

public class IfElseClass3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("type the number below:");
		
		int number = sc.nextInt();
		
if (number<= 10) {
			
			System.out.println("number is less than equal to 10");
			
		}if (number > 10 && number <= 20  ) {
			
			System.out.println("number is greater than 10 but less than equal to 20");
			
		}else {
			
			System.out.println("number is greater than 20");
			
		}
		

	}

}
