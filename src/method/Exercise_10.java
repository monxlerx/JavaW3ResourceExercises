package method;

import java.util.Scanner;

public class Exercise_10 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Input a year:");
		int year = in.nextInt();
		
		System.out.println(isLeapYear(year));
	}

	private static boolean isLeapYear(int year) {
		boolean a = (year % 4) == 0;
		boolean b = (year % 100) != 0;
		boolean c = (year % 100 == 0) && (year % 400 == 0);
		
		return a && (b || c);
	}

}
