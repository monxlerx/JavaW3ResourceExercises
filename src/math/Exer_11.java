package math;

import java.util.Scanner;

public class Exer_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int number1 = sc.nextInt();
		System.out.println("Enter the second number");
		int number2 = sc.nextInt();
		
		if (meetConditionFifteen(number1, number2)) {
			System.out.println("the condition has been met");
		} else {
			System.out.println("the condition has not been met");
		}
		
	}
	
	public static boolean meetConditionFifteen (int numberA, int numberB) {
		return ((numberA == 15 ) || (numberB == 15) 
					|| (numberA + numberB == 15) || (numberB - numberA == 15)) ? true : false; 
		
	}

}
