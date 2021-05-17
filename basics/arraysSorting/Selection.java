package arraysSorting;

public class Selection {

	public static void main(String[] args) {
		
		int a[] = {3, 1, -2, 7, 4, 0};
		int n = a.length;
		
		for(int i=0; i<n-1; i++) {
			
			int minInd = i;
			
			for(int j=i; j<n-i; j++) {
				
				if(a[j] < a[minInd]) {
					minInd = j;
				}
				int temp = a[minInd];
				a[minInd] = a[j];
				a[j] = a[temp];
			}
			
			
			
		}
		for(int e: a) {
			System.out.print(e + " ");
		}
		
		

	}

}
