package inheritance;

public class Singer extends Person {
	
	public void sing() {
		System.out.println("Singer is singing");
	}
	
	public void eat() {
		System.out.println("Singer " + name + " is eating");
	}


}
