package collections_arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exer_8 {

	public static void main(String[] args) {

		List<String> colors = new ArrayList<String>();
		colors.add("Black");
		colors.add("Red");
		colors.add("White");
		colors.add("Purple");
		colors.add("Magic Blue");
		colors.add("Orange");
		
		System.out.println(colors);
		
		Collections.sort(colors);
		
		System.out.println(colors);

	}

}
