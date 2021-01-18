package conditionals;

import java.util.Scanner;

public class Exercise_30 {

	public static void main(String[] args) {

		int i;
		int j;
		int k;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first number");
		i = sc.nextInt();
		System.out.println("Enter a second number");
		j = sc.nextInt();
		System.out.println("Enter a third number");
		k = sc.nextInt();
		
		
		if (i > j && j > k) {
			System.out.println("Decresing");
		} else if (i < j && j < k) {
			System.out.println("Incresing");
		} else {
			System.out.println("Neither increasing or decreasing order");
		}
		
	}

}
