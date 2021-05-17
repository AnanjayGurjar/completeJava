package constructor;

class Vehicle{
	int wheels;
	Vehicle(){
		wheels = 4;
	}
}

	
public class Constructor {
	
	
	Constructor(){
		System.out.println("Object is now created");
	}
	
	

	public static void main(String[] args) {
		
		Constructor obj = new Constructor();   //constructor will be call once a object is created from it
											   //i.e. as soon as we create a object from the constructor,construtor will be called.
		
		Vehicle car = new Vehicle();   //now, if vehicle constructor was not called here,then we have to set the no of wheels separately
										// but since in constructor we have already setted the same, hence it will bydefault set wheels = 4
		System.out.println(car.wheels + " wheels");
		
	

	}

}

