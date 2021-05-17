package problems;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean a = sc.nextBoolean();
		boolean b = sc.nextBoolean();
		
		
		
		System.out.print(a||b);
		System.out.print(" ");
		System.out.print(a&&b);
		System.out.print(" ");
		System.out.print((!a)&&(!b));
	}

}
