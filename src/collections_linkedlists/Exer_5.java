package collections_linkedlists;

import java.util.LinkedList;

public class Exer_5 {

	public static void main(String[] args) {

		LinkedList<String> colors = new LinkedList<String>();
		colors.add("White");
		colors.add("Black");
		colors.add("Purple");
		colors.add("Brown");
		
		System.out.println(colors);
		
		colors.add(2, "Orange");
		
		System.out.println(colors);
	}

}
