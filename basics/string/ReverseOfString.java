package string;

import java.util.Scanner;

public class ReverseOfString {
	
		
		

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int i = s.length()-1;
		String ans = "";
		
		while(i>= 0) {
			while(s.charAt(i) == ' ' && i >= 0)i--;
			int j = i;
			if(i<0)break;
			
			while(i>=0 && s.charAt(i) != ' ') i--;
			
			if(ans.isEmpty()) {
				ans = ans.concat(s.substring(i, j));
			}else {
				ans = ans.concat(" " + s.substring(i,j));
			}
			
		}
		
		System.out.println(ans);

	}

}
