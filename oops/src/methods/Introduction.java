//methods is used if the given lines of code is repeated in your code and we declared it as 
//method and we can call it anytime we want


package methods;

public class Introduction {

	public static void main(String[] args) {
		int firstnumber = 10;
		int secondnumber = 15;
		int result = maxOf(firstnumber,secondnumber);
				System.out.println(result);
				
				
				sayHi();
		
	}
	static int maxOf (int a,int b) {   //here, this maxof will give the maximum of two numbers we
			return a>b?a:b;            //dont have to write this code n times,if we want max of two numbers n times
//obviously above lines can also be writtern as 
			
			
/*			if(a>b) {
 *				return a;
 *			}else {
 *				return b;
 *			}
*/			
		}
	static void sayHi() {        //note that in static main function non-static methods can't be called
		System.out.println("Hi");
		System.out.println("good morning");
	}
			
		


}

