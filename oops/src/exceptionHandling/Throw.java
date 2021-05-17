package exceptionHandling;

public class Throw {

	public static void main(String[] args) {
		fun1();
		

	}
	
	static void fun1() {
		int a = 5;
		int b = 3;
		int c = a/b;
		
		System.out.println(c);
		
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("danger was coming");
			/*it is basically used if programmer want to throw error due to any reason,
			 * without actually having error
			 */
		}
	}

}
