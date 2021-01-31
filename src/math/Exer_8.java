package math;

import java.util.Scanner;

public class Exer_8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Input an integer number: ");
		int x = in.nextInt();
		System.out.println("The absolute value is " + absoluteValue(x));
		
	}
	
	public static int absoluteValue (int number) {
		int absoluteValue = (number >= 0) ? number : -number;
		return absoluteValue;
	}

}
