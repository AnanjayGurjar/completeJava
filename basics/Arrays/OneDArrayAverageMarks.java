//Write a program to find the average marks of students, where marks and number of students is gicen by the user


package Arrays;

import java.util.Scanner;

public class OneDArrayAverageMarks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students here:");
		
		int n = sc.nextInt();
		
		int marks[] = new int[n];  //introduced the number of spaces which must be booked 
		                           //for marks to be used further
		System.out.println("Enter the marks of students here:");
		
		for (int i=0; i<n; i++) {
			
			 marks[i] = sc.nextInt();
			
	}
		int sum = 0;
		
		for (int i=0; i<n; i++) {
		
		sum = sum + marks[i];
	
}
		
		double averagemarks = (double)sum/(double)n;
		
		
		System.out.println("The average marks of class is " + averagemarks);
		
	}
}
