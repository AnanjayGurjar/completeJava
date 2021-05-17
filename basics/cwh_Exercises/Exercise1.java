/*Write a program to calculate the percentage marks of students,given by user*/

package cwh_Exercises;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the maximum marks in each subjects");
		
		int mm = sc.nextInt();
		
		int marks[] = new int[5];
		int n = marks.length;
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			
			int j = i+1;
			
			System.out.println("Enter marks of subject " + j);
			 marks[i] = sc.nextInt();
			 sum += marks[i];
			
		}
		
		double totalMarks = 5*mm;
		
		
		double avgmarks = (double)sum/totalMarks;
		double permarks = avgmarks*100;
		System.out.println("The percentage marks obtained is " + permarks);

	}

}
