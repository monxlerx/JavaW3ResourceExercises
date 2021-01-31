package numbers;

import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the low range number");
		int lowerNumber = sc.nextInt();
		System.out.println("Enter the top range number");
		int topNumber = sc.nextInt();
		System.out.println("The random number is " + generateRandomNumber(lowerNumber, topNumber));
		
	}
	
	public static int generateRandomNumber(int lowerRange, int topRange) {
		int randomNumber = (int) (Math.random() * (topRange - lowerRange)) + lowerRange;
		return randomNumber;
	}

}
