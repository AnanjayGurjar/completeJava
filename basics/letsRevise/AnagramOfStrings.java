package letsRevise;

public class AnagramOfStrings {
	
	public static void main(String []args) {
	
	String a = "cat";
	String b = "act";
	
	boolean isAnagram = false;
	boolean[] isVisited = new boolean[b.length()];
	
	if(a.length() == b.length()) {
		
		for(int i =0; i< a.length(); i++) {
			
			char c = a.charAt(i);
			isAnagram = false;
			
			for(int j =0; j< b.length(); j++) {
				if(b.charAt(j) == c && !isVisited[j] ) {
					isAnagram = true;
					isVisited[j] = true;
				}
			}
		}
		
		
	}
	System.out.println(isAnagram);
		
	}

}
