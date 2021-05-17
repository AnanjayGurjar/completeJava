//Write a program to determine what a person would be doing if on the particular day of week, where day of week is given by the user


package switchCase;

import java.util.Scanner;

public class SwitchCase {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter day number here(sunday as 1,monday as 2 and so on): ");
		
		int dayOfWeek = sc.nextInt();
		
		switch (dayOfWeek){
			
			case 1:
				System.out.println("I'm on leave today");
				break;
				
			case 2:
			case 3:
				System.out.println("I'm at office today");
				break;
				
			case 4:
				System.out.println("I'm playing football");
				break;
				
			case 5:
				System.out.println("I'm studying");
				break;
				
			case 6:
				System.out.println("I'm at bank");
				break;
				
			case 7:
				System.out.println("I'm travelling");
				break;	
		}


	}

}

//This program can also be made using nested if else