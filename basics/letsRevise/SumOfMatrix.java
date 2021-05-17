package letsRevise;

import java.util.Scanner;

public class SumOfMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of columns");
		int cols = sc.nextInt();
		
		int mat1 [][] = new int[rows][cols];
		int mat2 [][] = new int[rows][cols];
		int mat3 [][] = new int[rows][cols];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j<cols; j++) {
				 mat1[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j<cols; j++) {
				 mat2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("First Marix : ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j<cols; j++) {
				 System.out.print(mat1[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("Second Matrix : ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j<cols; j++) {
				 System.out.print(mat2[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("The required matrix is : ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j<cols; j++) {
				mat3[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(mat3[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
