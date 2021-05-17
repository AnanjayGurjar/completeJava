package staticKeyword;

public class Person{		//we cannot declare a top level class as static,but we can declare a nested class as static
	
	int age;
	String name;
	
	static String breed = "homo sapiens";		//static keyword cannot be declared in a non-static innertype
												//since person class here is not a inner type(it's main class here) it can be declared as static
									
}



