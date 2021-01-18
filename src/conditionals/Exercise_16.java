package conditionals;

import java.util.Scanner;

public class Exercise_16 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Input a natural number");
		int number = in.nextInt();

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(j);

			System.out.println("");
		}

	}

}
