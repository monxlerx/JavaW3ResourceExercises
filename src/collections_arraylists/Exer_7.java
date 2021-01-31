package collections_arraylists;

import java.util.ArrayList;
import java.util.List;

public class Exer_7 {

	public static void main(String[] args) {

		List<String> colors = new ArrayList<String>();
		colors.add("Black");
		colors.add("Red");
		colors.add("White");
		colors.add("Purple");
		colors.add("Magic Blue");
		colors.add("Orange");
		
		if ( colors.contains("Red")) {
			System.out.println("It is appears in the list");
		} else {
			System.out.println("No it isn´t in the list");
		}
	}

}
