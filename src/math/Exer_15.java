package math;

import java.util.Scanner;

public class Exer_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = 0;
		int sum = 0;
		int n_numbers = 0;
		
		while (number != -1) {
			System.out.println("Enter a number. Insert zero to quit the program");
			number = sc.nextInt();
			if (number != -1) {
				sum += number;
				n_numbers++;
			}
		}
		
		System.out.println("The average is " + calculateAverage(sum, n_numbers));
	}
	
	public static float calculateAverage(int sum, int numbers) {
		float average = sum / numbers;
		return average;
	}
}
