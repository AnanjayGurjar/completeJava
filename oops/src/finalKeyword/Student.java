package finalKeyword;

public class Student {
	
	int rollNo;
	static String name;
	
	public static void getDescription() {			//can't be overrided by its children class
		System.out.println("the student name is" + name);
	}

}
