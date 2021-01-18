package conditionals;

import java.util.Scanner;

public class Exercise_27 {

	public static void main(String[] args) {

		int number;
		System.out.print("Input a number ");
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
				
		if (number > 0) {
			System.out.println("Positive number");
		} else if (number < 0) {
			System.out.println("Negative number");
		} else {
			System.out.println("Zero");
		}
	}

}
