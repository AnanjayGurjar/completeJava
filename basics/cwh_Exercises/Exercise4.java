/*Write a program to reverse an array*/

package cwh_Exercises;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
//	  System.out.println("Enter the length of array:");
//	  
//	  int n = sc.nextInt();
	  int a[] = {5,7,3,2,6};
	  int n = a.length;
	  

//	  for(int element:a) {
//		  element = sc.nextInt();  
//	  }
	  for(int i = 0; i<n/2;i++) {
		  int temp = a[i];
		  a[i] = a[n-i-1];
		  a[n-i-1] = temp;
		  
	  }
	  for(int e: a) {
		  System.out.print(e + " ");
	  }
	 
	  

	}

}
