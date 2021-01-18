package array;

import java.util.Scanner;

public class Exercise_5 {

	public static void main(String[] args) {

		float[] numbers = { 2, 10, 10 };
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a number");
		float number = sc.nextFloat();
		
		if (searchFor(numbers, number) == true) {
			System.out.println("It is present the number in the array");
		} else { 
			System.out.println("Sorry, it is not present");
		}

	}

	private static boolean searchFor(float[] numbers, float number) {
		boolean isPresent = false;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == number) {
				isPresent = true;
			}
		}
		return isPresent;		
	}

}
