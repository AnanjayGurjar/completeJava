package collections;
import java.util.*;

public class MethodsInArrayLists {
	
	public static void main(String [] args) {
		
		List <String> fruits = new ArrayList<>();
		List <String> vegetables = new ArrayList<>();
		
		fruits.add("Apple");	//'add' method is used to add something to arraylist
		fruits.add("orange");
		fruits.add("Banana");
		
		System.out.println(fruits);
		
		vegetables.add("potato");
		vegetables.add("Tomato");
		vegetables.add("carrot");
		
		//'addAll(Collection)' is used to add one collection to another collection(collection should not necessarly be arraylist)
		
		fruits.addAll(vegetables);
		System.out.println(fruits);
		
		//'get(index)' is used to get element at particular index of the collection
		System.out.println(fruits.get(1));
		
		//'set(index,value)' is used to exchange the particular element of the collection to other element
		fruits.set(1, "cabbage");
		System.out.println(fruits.get(1));
		
		//'remove(index)' is used to remove element at any particular index
		fruits.remove(1);
		System.out.println(fruits.get(1) + " " + fruits);
		
		//'removeAll(collection)' is used to remove a particular collection from another collection, one can make a new collection of
		//objects which need to removed from the original collection
		fruits.removeAll(vegetables);
		System.out.println(fruits);
		
		//'clear()' is used to clear complete collection(i.e. all the elements of the collection)
		
		//'size()' is used to get the size of particular list
		
		System.out.println(fruits.size());
		
		//'contains()' is used to check if the particular element exist in the list or not
		
		System.out.println(fruits.contains("Apple"));
		
		//'isEmpty()' is used to check if the particular list is empty or not
		
		//'toArray()' is used to change the list to array
		vegetables.toArray();			//other way is to either declare a array of same size(say temp) and then use vegetables.toArray(temp)
										// or use Object kuchBhi [] = fruits.toArray;
		for(String e : vegetables) {
			System.out.println(e);
		}
		
		
		
		
		
	}

}
