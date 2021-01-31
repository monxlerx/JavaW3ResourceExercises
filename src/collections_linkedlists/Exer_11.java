package collections_linkedlists;

import java.util.LinkedList;

public class Exer_11 {

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
	}

}
