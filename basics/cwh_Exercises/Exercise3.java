/*Write a program to find whether the given integer is present in the array or not*/

package cwh_Exercises;

public class Exercise3 {

	public static void main(String[] args) {
		
		float b[]= {45.7f,67.8f,63.4f,99.2f,100.0f};
		float num = 45.9f;
		
		boolean isInArray = false;
		for(float e : b) {
			if(num == e) {
				isInArray = true;
				break;
			}
		}
		if(isInArray) {
			System.out.println("The given number is in Array");
		}else {
			System.out.println("The given number is not in Array");
		}

	}

}
