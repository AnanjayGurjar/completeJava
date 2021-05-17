//Write a program in which user can give infinite input but it terminates as soon as user input a negative integer


package loops;

import java.util.Scanner;

public class ForLoopsBreak2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//int n = sc.nextInt();      can't put here
		
		for(;;) {
			int n = sc.nextInt();
		if (n<0){
			break;
		}
	}

}
}