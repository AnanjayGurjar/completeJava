package inheritance;

public class DowncastingUpcasting {

	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.name = "rohan";
		
		Person p = t1; //upcasting, 	checked at compile time
		
		Teacher t2 = (Teacher)p; // downcasting, checked at run time
		p.eat();
		t2.eat();
		
		boolean yo = t1 instanceof Teacher;		//checks whether given object is instance of the given class or not
		System.out.println(yo);
		System.out.println(t1 instanceof Person);
		System.out.println(t2 instanceof Person);
		
		System.out.println(p instanceof Singer);

	}

}
