package collections_linkedlists;

import java.util.LinkedList;
import java.util.Scanner;

public class Exer_12 {

	public static void main(String[] args) {

		LinkedList<String> colors = new LinkedList<String>();
		colors.add("White");
		colors.add("Black");
		colors.add("Purple");
		colors.add("Brown");
		colors.add("Red");
		
		System.out.println(colors);
		
		for (int i = 0; i < colors.size(); i++) {
			System.out.println("Element number: " + (i+1) + " - " + colors.get(i));
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a position");
		int position = sc.nextInt();
		
		colors.remove(position);
		
		for (int i = 0; i < colors.size(); i++) {
			System.out.println("Element number: " + (i+1) + " - " + colors.get(i));
		}
	}

}
