//Write a program to print number from 1-100 which skips 30-40


package loops;

public class ForLoopsContinue {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			if (i>= 30 && i<= 40) {
				continue;
			}System.out.println(i);
		}

	}

}
