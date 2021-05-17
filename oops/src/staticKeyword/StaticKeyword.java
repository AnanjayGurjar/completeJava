//Static keyword is related to class not to object.It can be applied to variables, methods, blocks and nested class

//if any method is declared static it means there will be only one copy of that at class level

package staticKeyword;

import staticKeyword.A.B;
import staticKeyword.A.C;

public class StaticKeyword {
	
	/*Shown below is a static block,in static block(piece of code putted together),whenever there
	 * is start of execution of class,static block will be executed first */
	
	static {
		
		System.out.println("in block 1");
	}
	
	static {
		System.out.println("in block 2");
		
	}
	

	public static void main(String[] args) {
		
		//System.out.println(Math.PI);
		//System.out.println(Math.floor(15.525));
		
		A objA = new A();
		//A.B objB = objA.new B();			one way,other is to import B from A
		B objB =objA.new B();
		
		C objC = new A.C();			//there is no need to create object of outer class
		
		System.out.println("inside main");

	}
	
	static {
		System.out.println("in block 3");
		
	}

}
