package MainClass;


class Cat{
	boolean hasfur;
	String colour,breed;
	int legs,eyes;
	
	public void walk(){
		System.out.println("My cat is walking");
	}
	public void eat() {
		System.out.println("My cat is eating");
	}
	public void description() {
		System.out.println("My cat has " + legs + " legs and " + eyes + " eyes");
		
	}
}

//class Dog{
//	String breed, name;
//	public void jump() {
//		System.out.println("My dog " + name + " can jump");
//	}
//	public void description() {
//		System.out.println("My dog's name is "+ name + " and it's breed is " + breed);
//	}
//}
public class MainClass {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.hasfur = true;    /*if value of variable not defined it will by default carry 0*/
		cat1.legs = 4;
		cat1.eyes = 1;
		
		//System.out.println(cat1.legs);    to print any variable defined earlier
		
		cat1.walk();
		cat1.description();
		
		Cat cat2 = new Cat();
		cat2.eat();
		cat2.legs = 3;
		cat2.eyes = 2;
		
		cat2.description();
		
		
		

	}

}

