package string;

import java.util.Scanner;

public class Exercise_40 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String phrase = "noelvalapl";
		
		System.out.println("Enter a number of parts you want to chop the string");
		Integer parts = sc.nextInt();
		
		divideStringInEqualParts(phrase, parts);

	}
	
	public static void divideStringInEqualParts (String phrase, Integer n) {
		if (phrase.length() % n == 0) {
			for (int i=0; i<phrase.length(); i+=n) {
				System.out.println(phrase.substring(i, n+i));
			}			
		} else {
			System.out.println("You cannot divide in " + n + " parts");
		}
	}
}
