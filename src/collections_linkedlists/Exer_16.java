package collections_linkedlists;

import java.util.Collections;
import java.util.LinkedList;

public class Exer_16 {

	public static void main(String[] args) {

		LinkedList<String> colors = new LinkedList<String>();
		colors.add("White");
		colors.add("Black");
		colors.add("Yellow");
		colors.add("Orange");
		
		System.out.println(colors);
		
		Collections.swap(colors, 0, 2);
		
		System.out.println(colors);
	}

}
