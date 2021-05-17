package finalKeyword;

public class MainClass {
	
	final int ROLL_NO = 2;			//variable under class(global) must be intilaized but local variable(name in this case)not neccesarily be initialized
				/*(since the variable is final it is good to make it all caps(not neccesarily)*/
	public static void main(String [] args) {
		
		final String name = "Anuj";
		
		//name = "Kumar";		//final variable cannot be changed
		
		
	}

}
