//Write a program to find the sum of the two matrix given by the user


package Arrays;

import java.util.Scanner;

public class TwoDArraysSumOfMatrices {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number of rows : ");
		int rows = sc.nextInt();
		
		System.out.println("Enter number of columns : ");
		int cols = sc.nextInt();
		
		int a[][]= new int [rows][cols];
		int b[][]= new int [rows][cols];
		int c[][]= new int [rows][cols];
		
		System.out.println("Enter first matrix here : ");
		
		for(int j = 0; j< rows; j++) {
			for (int i = 0 ; i< cols; i++) {
				 a[j][i]= sc.nextInt();
			}
		}
		
		System.out.println("Enter second matrix here : ");
		for(int j = 0; j< rows; j++) {
			for (int i = 0 ; i< cols; i++) {
				 b[j][i]= sc.nextInt();
			}
		}
		
		System.out.println("First Matrix");
		
		for(int j = 0; j< rows; j++) {
			for (int i = 0 ; i< cols; i++) {
				 System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
		
			System.out.println("Second Matrix");
					
			for(int j = 0; j< rows; j++) {
			 for (int i = 0 ; i< cols; i++) {
			     System.out.print(b[j][i] + " ");
			 }
				System.out.println();
		}
		System.out.println("The required sum of matrix is : ");
		for(int j = 0; j< rows; j++) {
			for (int i = 0 ; i< cols; i++) {
				 c[j][i]= a[j][i] + b[j][i];
			}
		}

	for(int j = 0; j< rows; j++) {
		for (int i = 0 ; i< cols; i++) {
			 System.out.print(c[j][i] + " ");
		}
		System.out.println();
	}

}}
