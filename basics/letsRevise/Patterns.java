package letsRevise;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of terms here");
		int n = sc.nextInt();
		
		/*Pattern 1*/
		
//		for (int i = 1; i<= n; i++) {
//			for(int j= 1; j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		/*Pattern 2*/
		
		
//		for(int i = 1; i <= n; i++) {
//			for(int j = 0; j<= n-i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		/*Pattern 3*/
		
		
//		for(int i = 1;i <= n; i++) {
//			
//			for(int j = 1;j<= i-1;j++) {
//				System.out.print("  ");
//			}
//			
//			for(int j = 1;j< n-i+1; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		/*Pattern 4*/
		
//		for(int i = 1;i <= n; i++) {
//			
//			for(int j = 1;j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			
//			for(int j= 1; j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		/*Pattern 5*/
		
//		for(int i = 1; i<= n ; i++) {
//			
//			for(int j = 1; j <= n-i; j++) {
//				System.out.print("  ");
//			}
//			
//			for(int j = 1; j <= i;j++) {
//				System.out.print("*   ");
//			}
//			System.out.println();
//		}
		
		/*Pattern 6*/
		
		
//		int number = 1;
//		for(int i = 1; i<= n ; i++) {
//		
//			for(int j = 1; j <= n-i; j++) {
//				System.out.print("  ");
//			}
//			
//			for(int j = 1; j <= i;j++) {
//				System.out.print(number++ +"   ");
//				
//			}
//			System.out.println();
//		}
		
		/*Pattern 7*/
		
		
//		System.out.println("*");
//		
//		for(int i = 1; i < n-1; i++){
//			System.out.print("*");
//			
//			for(int j = 1;j<= 2*i-1;j++) {
//				System.out.print(" ");
//			}
//		
//			System.out.println("*");
//		}
//		
//		for(int i = 1; i<= n; i++) {
//			System.out.print("* ");
//		}
		
		
		/*Pattern 8*/
		
		int rows = 2*n - 1;
		
		for (int i = 0;i<= rows/2; i++) {
			for(int j = 0; j< i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = rows/2+1; i<2*n;i++ ) {
			for(int j = 1; j< n-j;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
