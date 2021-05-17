package exceptionHandling;

public class Main {

	public static void main(String[] args) {
		
	try {		//we use try method where we think there might be an error,using this wont shutdown entire program and at the same time tell us what really error is.
		int a = 5;
		int b = 0;
		
		int c = a/b;
		System.out.println(c);		//Arithmetic exception is thrown here as we run the program
									//so, we will use try-catch method
	
	}catch(ArithmeticException e) {		//here we could have only written exception since arithmetic and all other exception extends class exception
		
		System.out.println(e.getMessage() + " error occured, please check");
		
	}catch(ArrayIndexOutOfBoundsException a) {
		
		System.out.println("index is out of bound");		//hence we can deetect as many exception as we want,and whichever exception occured it will print its statement
		
	}catch(IllegalArgumentException i) {
		
		System.out.println(i.getMessage() + "ia exc");
	}finally {
		System.out.println("Sorry for the inconvenience");	//will always run,no matter any of the catch run or not
	}
	
	System.out.println("Hey");

	}

}
