package collections_linkedlists;

import java.util.LinkedList;

public class Exer_20 {

	public static void main(String[] args) {
		
		LinkedList<String> colors = new LinkedList<String>();
		colors.add("Yellow");
		colors.add("Black");
		colors.add("Red");
		colors.add("White");
		
		System.out.println(colors);
		
		String color = colors.peekFirst();
		
		System.out.println(color);
		System.out.println(colors);

	}

}
