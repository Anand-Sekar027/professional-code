package selection_sort;

import java.util.Arrays;

public class Basic_programe {

	/* Take i index as minimum and compare rest for values and find minimum value and their index.
	 * Swap minimum value to i and increase i till n-1 .
	 * no need to check for last value its already largest number
	 */
	public static void main(String[] args) {
		int[] arr= {15, 55, 4, 98, 35};
		programe_one(arr);

	}
	
	public static void programe_one(int[] int_arr) {
		int n = int_arr.length;
		for (int i = 0; i<n-1; i++) {
			
			int min_index = i ;
			for(int j =i+1; j<n; j++) {				
				if (int_arr[j] < int_arr[min_index]) {					
					min_index = j; // Find minimum value's index
					//System.out.println("Mininum value = "+int_arr[j]+ " & index -> "+ j );
					//System.out.println("i - value = "+int_arr[i]+ " & index -> "+ i );
				}
			}
			// swap value of minimum to array of i		
			int temp = int_arr[min_index];
			int_arr[min_index] = int_arr[i];
			int_arr[i] = temp;
			System.out.println("Sorted Array @ i="+ i + " --> " + Arrays.toString(int_arr));
		}
		
		System.out.println("Sorted Array : "+ Arrays.toString(int_arr));
		
	}

}
