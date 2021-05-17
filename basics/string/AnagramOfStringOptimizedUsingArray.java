package string;

import java.util.Scanner;

public class AnagramOfStringOptimizedUsingArray {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the first string here : ");
			String a = sc.nextLine();
			
			System.out.println("Enter the second string here : ");
			String b = sc.nextLine();
			
			boolean isAnagram = true;
			
			int al[] = new int[256]; //Maximum 256 character are possible
			int bl[] = new int[256];
			for(char c: a.toCharArray()) {   //tochararray returns the array of particular string here it is a.tochararry
				int index = (int)c;
				al[index]++;
				
			}
			for(char c: b.toCharArray()) {  
				int index = (int)c;
				bl[index]++;
				
			}
			for(int i= 0 ; i<256;i++) {
				if(al[i] != bl[i]) {
					isAnagram = false;
					break;
				}
			}
			if(isAnagram) {
				System.out.println("anagram");
			}else {
				System.out.println("not anagram");
			}

	}

}
