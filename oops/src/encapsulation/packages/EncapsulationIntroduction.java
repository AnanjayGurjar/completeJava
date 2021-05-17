package encapsulation.packages;

public class EncapsulationIntroduction {

	public static void main(String[] args) {
		Student obj = new Student();
	/*	obj.name = "Tom";		since name and age is private in student class hence these cant be accessed normally
		obj.age = 19;				*/
		
		obj.setAge(25);
		obj.setName("Tom");
		
		
		

	}

}
