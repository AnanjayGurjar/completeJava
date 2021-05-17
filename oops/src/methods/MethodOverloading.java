//when a class has two or more methods by the same name but different parameters

package methods;

public class MethodOverloading {

	public static void main(String[] args) {
		int a = 10;
		float result = maxOf(10);
		System.out.println(result);
		}
	static int maxOf(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
		
	}
	static int maxOf(int d) {   //if there had been int c as well then their will be a error since both method name is maxOf and both have int as their parameters
		return 0;
	}

}
