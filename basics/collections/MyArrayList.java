package collections;
import java.util.*;


public class MyArrayList {

	public static void main(String[] args) {
		
		/*synthax of arraylist
		 * ArrayList<Type> arrayList = new ArrayList<>();*/
		
		ArrayList<String> fruits = new ArrayList();
		List<String> newfruits = new ArrayList();		//this way can also be used to create arrayList
		
		fruits.add("Apple");
		System.out.println(fruits);
		
		Pair<String,Integer> p1 = new Pair("Ananjay", 25);
		Pair<Boolean, String> p2 = new Pair(true, "Great");
		
		p1.getDescription();
		p2.getDescription();
		
	
		
		

}


}

