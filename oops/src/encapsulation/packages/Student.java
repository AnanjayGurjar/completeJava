package encapsulation.packages;
import java.util.Scanner;

public class Student {
	
	private int age;
	private String name;
	
	public int getAge() {			//getters and setters are used to access and set methods under private variable
		return age;
	}
	public void setAge(int age) {			//hence via getters and setters we can restrict who can have access to information and how he can change 

		if (age > 20) {
		System.out.println("You are too old to be a student in our school");
		}
		else{this.age = age;
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
