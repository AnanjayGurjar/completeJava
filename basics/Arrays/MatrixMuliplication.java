package Arrays;

import java.util.Scanner;

public class MatrixMuliplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		
		int m1[][] = new int [a1][a2];
		int m2[][] = new int [a2][a3];
		int ans[][] = new int [a1][a3];
		
		
		for(int i = 0; i<a1; i++) {
			for(int j = 0; j<a2; j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i = 0; i<a2; i++) {
			for(int j = 0; j<a3; j++) {
				m2[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i<a1; i++) {
			for(int j = 0; j<a3; j++) {
				for(int k = 0; k<a2; k++) {
					ans[i][j] += m1[i][k]*m2[k][j]; 
				}
			}
		}
		
		for(int i = 0; i<a1; i++) {
			for(int j = 0; j<a3; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
		

	}
}

