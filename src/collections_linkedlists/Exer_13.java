package collections_linkedlists;

import java.util.LinkedList;
import java.util.Scanner;

public class Exer_13 {

	public static void main(String[] args) {

		LinkedList<String> colors = new LinkedList<String>();
		colors.add("White");
		colors.add("Black");
		colors.add("Purple");
		colors.add("Brown");
		colors.add("Red");
		
		System.out.println(colors);
		
		colors.removeFirst();
		System.out.println(colors);
		
		colors.removeLast();
		System.out.println(colors);
		
	}

}
