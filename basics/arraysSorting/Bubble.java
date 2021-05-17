package arraysSorting;

public class Bubble {
	public static void main (String[]args) {
		
		int  a[]= {2, 1, 8,-3, 6, 4, 12};
		int n = a.length;
		
		for(int i = 0; i< n-1; i++) {
			
			boolean sorted = true;
			
			for(int j = 0; j< n-1; j++) {       //more efficient way is j<n-i-1
				if(a[j+1]<a[j]) {               //in this way last element which is already arranged wont be checked again
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					
					sorted = false;      //if no swapping is done throughout the loop,it means array is already sorted
				}                        // so by breaking the loop after no swaping is done,will reduce the no. of cycles of loop 
			}
		if(sorted == true) {    //could also use (sorted){break;}
			break;
		}
		}
			for(int item: a) {                     // it is for each loop which is used to print any iterable thing(here array)
				System.out.print( item + " ");
			}
		}
		
	}


