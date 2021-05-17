//Write a code to find which number is greatest among the three given numbers


package conditionalStatements;

public class IfElseClass4 {

	public static void main(String[] args) {
		
		int a = 13;
		int b = 9;
		int c = 8;
		
		int result = 0;
		
		
		if (a>b) {
			if (a>c) {
				
				 result = a;
				
			}else {
				
				result = c;
				
			}
				
			} else {
				
				if (b>c) {
					
					 result = b;
					
				}else {
					
					 result = c;
				}
				
			}
				
				System.out.println("The greatest of three number is " + result);
				
			
			}
		

	}


