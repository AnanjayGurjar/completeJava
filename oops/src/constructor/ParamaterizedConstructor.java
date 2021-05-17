package constructor;

class NewVehicle{    //here name of class can't be vehicle since class of same name already exists in other class of this package
	int wheels;
	int headlights;
	NewVehicle(int noofwheels){
		wheels = noofwheels;
	
		headlights = 2;
	}
}

public class ParamaterizedConstructor {

	public static void main(String[] args) {
		
		NewVehicle car = new NewVehicle(4);
		
		NewVehicle bike = new NewVehicle(2);
		
		System.out.println("Car has "+ car.wheels + " wheels and " + car.headlights + " headlights");
		System.out.println("Bike has "+ bike.wheels + " wheels and " + bike.headlights + " headlights");
		
		
		
		

	}

}

