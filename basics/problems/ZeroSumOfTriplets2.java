//Wrtie a program to find if sum of any three number of given array is equal to zero or not using two pointers

package problems;
import java.util.*;


public class ZeroSumOfTriplets2{
	
	public static boolean findTriplets(int a[] , int n)
    {
        Arrays.sort(a);
        
        for(int i = 0; i<n-2; i++){
            int j = i+1,k = n-1;
            while(j<k){
                if(a[j] + a[k] + a[i] == 0 ) {
				return true;
				}else if(a[j] + a[k] + a[i] < 0) {
					j++;
				}else {
					k--;
				}
            }
        }
        
        return false;
        
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(findTriplets(arr,n));
}
	
}