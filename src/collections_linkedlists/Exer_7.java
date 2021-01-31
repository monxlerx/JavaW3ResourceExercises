package collections_linkedlists;

import java.util.LinkedList;

public class Exer_7 {

	public static void main(String[] args) {

		LinkedList<String> colors = new LinkedList<String>();
		colors.add("White");
		colors.add("Black");
		colors.add("Purple");
		colors.add("Brown");
		
		System.out.println(colors);
		
		colors.addFirst("Maroon");
		colors.addLast("Green");
		
		System.out.println(colors);
	}

}
