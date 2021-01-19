package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise_22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] numbersArray = {4, 5, 6, 1, 2, 5, 55, 8, 12, 16, 4};
		
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		Map<Integer, Integer> pairNumbers = findPairNumbers(numbersArray, number);
		
		for (Map.Entry<Integer, Integer> entry : pairNumbers.entrySet()) {
			System.out.println("Value 1: " + entry.getKey() +  " Value 2 : " +entry.getValue());
		}
		
	}

	private static Map<Integer, Integer> findPairNumbers(int[] numbersArray, int number) {

		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		
		for (int i=0; i<numbersArray.length; i++) {
			for (int j=0; j<numbersArray.length; j++) {
				if (numbersArray[i] + numbersArray[j] == number) {
					pairs.put(numbersArray[i], numbersArray[j]);
				}
			}
		}
		
		return pairs;
	}

}
