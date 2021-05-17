package constructor;

class Vehicle2{
	int wheels;
	int headlights;
	String color;
	
	Vehicle2(int wheels){
		this.wheels = wheels;
		headlights = 2;
	}
	Vehicle2(int wheels,String color){
		this.wheels = wheels;
		this.color = color;
		headlights = 2;
	}
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Vehicle2 car = new Vehicle2(4);
		Vehicle2 car2 = new Vehicle2(4,"red");
		car.color = "black";
		
		System.out.println(car.wheels + " " + car.color + " " + car.headlights);
		System.out.println(car2.wheels + " " + car2.color + " " + car2.headlights);
		

	}

}
