/*Create an array of 5 floats given by user and calculate their sum*/

package cwh_Exercises;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float a[] = new float[5];
		
	    float sum = 0f;
//	    float sum2 = 0f;
	    
		for(int i = 0; i<a.length; i++) {
			a[i] = sc.nextFloat();
			sum += a[i];
		}
			//when floats are taken by ourself and sum is founded using for each loop
			
/*			float b[]= {45.7f,67.8f,63.4f,99.2f,100.0f};
			
			for (float element: b) {
				sum2 += element;
			}    */
			
			
		
		System.out.println(sum);
	//	System.out.println(sum2);
		

	}

}
