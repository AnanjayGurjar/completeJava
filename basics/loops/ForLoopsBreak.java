/*Break moves out of the loop(once the required condition is fulfilled) and 
 * executes next statements after the loop*/

//code to print number from 1-100 but will break in between
package loops;

public class ForLoopsBreak {

	public static void main(String[] args) {
		for (int i = 0; i<=100; i++) {
			if(i>=36)                           //or could have also been written as if(i==36)
			{
				break;
			}System.out.println(i);
		}
	}

}
