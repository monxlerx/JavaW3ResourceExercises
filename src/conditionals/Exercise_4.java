package conditionals;

import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float digit = 0;
		String answer = "";
		
		
		while (digit != 123) {
			System.out.println("Enter a number");
			digit = sc.nextFloat();
			
			if(digit == 0) {
				answer = "Zero";
				System.out.println(answer);
			} else if (Math.abs(digit) < 1) {
				answer = "Small";
				System.out.println(answer);
			} else if (Math.abs(digit) > 1000000) {
				answer = "Large";
				System.out.println(answer);
			} else if (digit >= 1) {
				answer = "Positive";
				System.out.println(answer);
			} else if (digit <= -1) {
				answer = "Negative";
				System.out.println(answer);
			}
		}
	}

}
