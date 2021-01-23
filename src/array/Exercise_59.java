package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercise_59 {

	public static void main(String[] args) {
		
		Integer[] numbers = {2, 3, 5, 7, -7, 5, 8, -5};
		Map<Integer, Integer> pair = findMaximumProduct(numbers);
		System.out.println("Pair is " + pair.toString() + 
				" Maximum product: " + showProductNumbers(pair));
				
	}
	
	private static Integer showProductNumbers(Map<Integer, Integer> map) {
		Integer product = 0;
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			product = entry.getKey() * entry.getValue();
		}
		return product;
	}

	public static Map<Integer, Integer> findMaximumProduct (Integer[] numbers) {
	
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Integer highestNumber = 0;
		Integer secondHighestNumber = 0;
		
		Arrays.sort(numbers);
		highestNumber = numbers[numbers.length - 1];
		secondHighestNumber = numbers[numbers.length - 2];
		
		map.put(secondHighestNumber, highestNumber);
	
		return map;
	}
}
