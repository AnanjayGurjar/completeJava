package cwh_Exercises;

import java.util.Scanner;
import java.util.Random;

public class CreatingAStonePaperScissor {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int computer = rnd.nextInt(10);  //1= rock, 2 = scissors, 3 = paper
		
		System.out.println("Enter the choice(1 - rock , 2 - scissor , 3 - paper)");
		int you = sc.nextInt();
		
		if (you >0 && you<4) {
		switch (computer) {
		case 1:
		case 4:
		case 7:
			if (you == 1) {
				System.out.println("your choice : rock,computer choice : rock;it's a draw");
			}if (you == 2) {
				System.out.println("your choice : scissor,computer choice : rock;computer won");
			}if (you == 3) {
				System.out.println("your choice : paper,computer choice : rock;you won");
			}
			break;
		case 2:
		case 5:
		case 8:
			if (you == 1) {
				System.out.println("your choice : rock,computer choice : scissor;you won");
			}if (you == 2) {
				System.out.println("your choice : scissor,computer choice : scissor;it's a draw");
			}if (you == 3) {
				System.out.println("your choice : paper,computer choice : scissor;computer won");
			}
			break;
		case 3:
		case 6:
		case 9:
			if (you == 1) {
				System.out.println("your choice : rock,computer choice : paper;computer won");
			}if (you == 2) {
				System.out.println("your choice : scissor,computer choice : paper;you won");
			}if (you == 3) {
				System.out.println("your choice : paper,computer choice : paper; it's a draw");
			}
			break;
		}
		
		}else {
			System.out.println("invalid operation");
		
		}
		
		

	}

}
