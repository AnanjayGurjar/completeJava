//Write a program to replace all the space in the given string to underscore

package cwh_Exercises;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String st = sc.nextLine();
		System.out.println(st.replace(' ', '_'));

	}

}
