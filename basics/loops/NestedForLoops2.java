//Write a program to print table of 1-20


package loops;

public class NestedForLoops2 {

	public static void main(String[] args) {
		
		for (int j = 1; j<=10; j++) {
			
		for(int i =1; i<=20; i++) {
			System.out.print(i*j + "     ");
		   }
		System.out.println();
		}

	}

}
