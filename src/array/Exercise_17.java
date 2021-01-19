package array;

import java.util.Arrays;

public class Exercise_17 {

	public static void main(String[] args) {

		int[] my_array = { 10789, 2035, 1899, 1456, 2013, 
	            			1458, 2458, 1254, 1472, 2365, 
	            			1456, 2165, 1457, 2456 };
		
		System.out.println("The second largest number is " + findSecondLargestNumber(my_array));
		
	}
	
	public static int findSecondLargestNumber (int[] array) {
		Arrays.sort(array);
		int secondLargestNumber = array[array.length - 2];	
		
		return secondLargestNumber;
	}
	
}
