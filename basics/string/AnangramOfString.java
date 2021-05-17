//this program is not completely correct it has some bugs,created just to check basic concept


package string;

import java.util.Scanner;

public class AnangramOfString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first string here : ");
		String a = sc.nextLine();
		
		System.out.println("Enter the second string here : ");
		String b = sc.nextLine();
		
		boolean isAnagram = false;
		
		if(a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				char c = a.charAt(i);
				 isAnagram = false;
				for(int j = 0;j < b.length(); j++) {
					if(b.charAt(j)==c) {
						isAnagram = true;
						break;
					}
				}
				if (!isAnagram) {        //if we came to know that it is not a anagram after 
					break;               // one or two iterate then we will directly break and will come out of loop
				}
			}
		}
		if (isAnagram == true) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not a Anagram");
		}

	}

}
     /* problem with above code is that it will give anagram if all the letter of first 
      * string founded in the second no matter if second have extra words. For eg. aab &
      * abc are not anagram but all words of first string a,b are present in the second
      * one despite of being of same length, hence program will give it a anangram
      */

