package string;

import java.util.Scanner;

public class Exercise_27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String old = "The quick brown fox jumps over the lazy dog.";

		System.out.println("Enter the first position");
		int firstPosition = sc.nextInt();
		System.out.println("Enter the second position");
		int secondPosition = sc.nextInt();

		String newString = old.substring(firstPosition, secondPosition);
		System.out.println(newString);
	}

}
