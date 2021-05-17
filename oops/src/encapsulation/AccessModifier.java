/*Private = only within class
 * Default = only within package
 * Protected = within package and outside package through child
 * public = access level is everywhere    */

package encapsulation;

public class AccessModifier {
	
	public static void main (String []args) {
		Student s1 = new Student();
		
		s1.setAge(15);
		s1.setName("Rohan");
		
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
		
		
		
	}


}
