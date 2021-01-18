package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise_1 {

	public static void main(String[] args) {

		int[] numbers = {4, 5, 6, 3, 1, 10};
		String[] words = {"pet", "cementary", "funeral", "life"};
		
		sortingNumbers(numbers);
		sortingWords(words);
	
	}
	
	public static void sortingNumbers (int[] arr) {
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void sortingWords (String[] arr) {
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
