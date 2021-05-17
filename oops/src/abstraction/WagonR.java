package abstraction;

public class WagonR extends Car {
	
	public void accelerate() {
		
		System.out.println("WagonR is accelerating");
	}

	@Override		//simply denotes that this method is overrided,compiler won't throw an error if it is not written
	public void brake() {			//if parent class as abstract method than children must posses them
		// TODO Auto-generated method stub
		
	}
	
	

}
