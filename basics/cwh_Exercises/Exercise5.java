/* Write a program to find the maximum element in array*/

package cwh_Exercises;

public class Exercise5 {

	public static void main(String[] args) {
		int []a = {1, 15, 63, 155,29, 8};
		
		int max = 0;      //integer.MAX_VALUE and integer.MIN_VALUE will give max and min value java can hold hence it can also be used to find most correct answer
		for(int e: a) {
			if (e>max) {
				max = e;
			}
		}
		System.out.println(max);
		

	}

}
