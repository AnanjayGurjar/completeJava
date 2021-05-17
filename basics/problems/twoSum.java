//Write a program to check if sum of any two elements of given array is equal to the given no.,using two pointers algorithm
//(consider the given array is sorted)


package problems;

import java.util.Scanner;

public class twoSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		boolean sumExists = false;
		
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		int i = 0,j = n - 1;
		while(i<j) {
			if(a[i] + a[j] == x) {
				sumExists = true;
				break;
			}else if(a[i] + a[j] < x) {
				i++;
			}else {
				j--;
			}
			
		}
		
		if(sumExists) {
			System.out.println("The given no. exists as the sum of two numbers");
		}else {
			System.out.println("The given no. doesnot exists as the sum of two numbers");
		}
		

	}

}
