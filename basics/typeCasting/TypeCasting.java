package typeCasting;

enum Transport{
	plane(100), train(45), automobile(30);
	int speed;
	Transport(int speed){
		this.speed = speed;
		
	}
}

public class TypeCasting {

	public static void main(String[] args) {
		
//		byte x = 4;
//		
//		double y = x;
//		
//		System.out.println(x); "shortcut for comment = Ctrl + /"
//		
//		System.out.println(y);
		
		Transport t[] = Transport.values();
		for(Transport e : t) {
			System.out.println(e);
		}
		
		System.out.println(Transport.automobile.speed);
		
		
		
		double myDouble = 2.8234;
				
		int myInt =(int) myDouble;
		
		System.out.println(myDouble);
		System.out.println(myInt);

	}

}
