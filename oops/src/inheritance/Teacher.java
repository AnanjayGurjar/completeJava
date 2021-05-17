package inheritance;

public class Teacher extends Person {
	
	public void teach() {
		System.out.println(name + " is teaching");
	}
	
	public void eat() {
		
		super.eat();  //super is used to refer to parent class immediately by subclass
		System.out.println("Teacher " + name + " is eating");
	}


}
