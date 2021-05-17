package methods;

public class PassByValue {

	public static void main(String[] args) {
		int c = 34;
		int d = 12;
		swap (c,d);
		System.out.println(c);  //even after swapping c and d print their respective value
		System.out.println(d);  //not changed value because it changes the value at a and b not at c and d which proves it is pass by value
		

	}
	static void swap(int a,int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
