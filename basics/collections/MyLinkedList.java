/**/
package collections;
import java.util.*;

public class MyLinkedList {

	public static void main(String[] args) {
		List <Integer> ll = new LinkedList<>();
		
		List <Integer> al = new ArrayList<>();
		
		getTimeDiff(al);
		getTimeDiff(ll);
		
		
		
		
	}
	
	static void getTimeDiff(List<Integer> list) {
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i<100000; i++) {
			list.add(0, i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName() 		//here list is the object of some class so by using getClass() we generated class and by using get name we finally obtained name of that class
				+ " " + (end - start));
		
	}

}
