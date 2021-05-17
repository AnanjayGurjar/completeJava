package string;

import java.util.Scanner;

public class AnagramOfStringCorrected {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first string here : ");
		String a = sc.nextLine();
		
		System.out.println("Enter the second string here : ");
		String b = sc.nextLine();
		
		boolean isAnagram = false;
		boolean visited[] = new boolean[b.length()];   //if any word is visited then it will be checked and will ignored after that
				
		if(a.length() == b.length()) {
	     for (int i = 0; i < a.length(); i++) {
		  char c = a.charAt(i);
		  isAnagram = false;
		  
		 for(int j = 0;j < b.length(); j++) {
		 if(b.charAt(j)==c && !visited[j]) {
		 isAnagram = true;
		 visited[j] = true;
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