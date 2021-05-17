package dsa;

public class Problem1_TrappingRain {

	public static void main(String[] args) {
		
		int arr[] = { 4, 0, 1, 2};
		int n = arr.length;
		
		int totalWater = 0;
		int max = 0;
		int leftmax = 0;
		int rightmax = 0;
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j<=i;j++ ) {
				if(arr[j] >= max) {
					 leftmax = max;
					leftmax = arr[j];
				}
			}
			
			for(int j = i; j< n;j++) {
				if(arr[j] >= max) {
					 rightmax = max;
					rightmax = arr[j];
				}
			}
			
			int waterInIndex = minof(leftmax,rightmax) - arr[i] ;
			if(waterInIndex >0) {
				totalWater += waterInIndex;
			}
			
		}
		
		System.out.println("The total water trapped is " + totalWater + " units");
		
		
		}
	
	public static int maxof (int a, int b) {
		int max = a>b? a:b;
		return max;
	}
	
	public static int minof (int a, int b) {
		int min = a<b? a:b;
		return min;
	}

}
