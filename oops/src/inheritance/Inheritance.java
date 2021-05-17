package inheritance;

public class Inheritance {

	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		t.name = "Mr. Harry";
		
		t.eat();
		t.teach();    //it will take the property from teacher class,this is method overriding
		System.out.println(t.name);
		
		Singer s = new Singer();
		s.name = "Adele";
		s.sing();
		s.eat();
		
		

	}

}
//Java doesnot support multiple inheritance because:

/* The problem with multiple inheritance is that two classes may define different way of doing 
 * the same thing and subclass can't choose which one to pick*/
