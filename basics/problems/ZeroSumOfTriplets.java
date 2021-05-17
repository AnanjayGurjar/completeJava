//Wrtie a program to find if sum of any three number of given array is equal to zero or not

package problems;

import java.util.Scanner;

public class ZeroSumOfTriplets {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum;
		boolean isTriplet = false;
		
		for(int i = 0;i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<n; i++) {
			for(int j = i+1;j<n; j++) {
				for(int k = j+1; k<n ;k++) {
					sum = arr[i] + arr[j] + arr[k];
					if(sum == 0) {
						isTriplet = true;
						break;
					}
				}
			}
		}
		
		if(isTriplet) {
			System.out.println("Given array contains triplet whose sum is zero");
		}else {
			System.out.println("Given array doesnot conatains triplet whose sum is zero");
		}
		
		
		
		
		

	}

}
