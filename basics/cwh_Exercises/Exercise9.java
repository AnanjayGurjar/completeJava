//Write a program to determine whether the given string contains double and triple spaces

package cwh_Exercises;

public class Exercise9 {

	public static void main(String[] args) {
		String st = "This String contains  double and triple spaces";
		System.out.println(st.indexOf("  "));   //will give index if present and if absent will simply return -1
		System.out.println(st.indexOf("   "));

	}

}
