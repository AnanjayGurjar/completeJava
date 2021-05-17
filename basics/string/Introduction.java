package string;

public class Introduction {

	public static void main(String[] args) {
		
		/*string pool area do the caching, it will not create a new string if same string is already present there.
		 *say animal1 and animal2 both named as cat,so it will create space to store animal1 and then for animal2
		 *simply assign the value of animal1 and wont create any extra memory for animal2*/
		
		String name = "Ananjay";    // will be stored in string pool area
		System.out.println("1 " + name);
		
		/*In case if string is stored in heap memory it will also create its copy in string pool area,
		 * basically string pool area is subset of heap memory
		 */
		String name2 = new String("Ananjay");    //will be stored in heap memory
		
		System.out.println(name == name2);   //this will give false because both are stored in different memories
		
		System.out.println(name.equals(name2));  //unlike last one, it will check if value of both strings are actually true
		
		String name3 = "Ananjay Gurjar";
		
		System.out.println("2 " + name.charAt(2));    // give particular character for particular index starting from 0
        
		System.out.println("3 " + name3.length());     // give length of the String
		
		System.out.println("4 " + name3.substring(2));  // give substring from the given index
		
		System.out.println("5 " + name3.substring(2,9));  // give substring from given index to given index
		
		System.out.println("6 " + name3.contains("jay"));   // check whether given char/string is in string
		
		
		System.out.println("7 " + name.isEmpty());  /*check whether given string is empty or not for eg.*/
		                                          String eg = "";  System.out.println("8 " + eg.isEmpty());
		System.out.println("9 "+ name3.replace('a','d'));  //replace a character to a new one
		
		System.out.println("10 " + name.concat(" kumar"));  //concat is used to simply add two strings
		
		System.out.println(name.indexOf('a'));   //will give index of particular character of first a in name in case if given letter is not present in string it will return -1
		
		//toLowerCase() convert all the upper case letter in the string to lower case
		//toUpperCase() will do opposite of above function
		
		String a = "       Ananjay gurjar       ";
				
		System.out.println(a.trim()  + a);  //will remove unneccesary trailing spaces in start and at end of the string
		
		String cars = "Hyundai, ferrari, Maruti, Swift, WagonR";
		
		String allcars[] = cars.split(",") ;      //split given array about a word(here it is ',')
		
		for(String car: allcars) {
			System.out.println(car);
			
	   }
		
		
	}

}
