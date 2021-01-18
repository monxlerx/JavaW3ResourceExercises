package array;

import java.util.Scanner;

public class Exercise_6 {

	public static void main(String[] args) {

		float[] numbers = { 2, 10, 10, 4, 6 };
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a number");
		float number = sc.nextFloat();
		
		searchFor(numbers, number);
		
	}

	private static void searchFor(float[] numbers, float number) {
		int index = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == number) {
				index = i;
			}
		}
		System.out.print("The position is " + index);	
	}
}
