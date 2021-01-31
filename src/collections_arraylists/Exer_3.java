package collections_arraylists;

import java.util.ArrayList;
import java.util.List;

public class Exer_3 {

	public static void main(String[] args) {

		List<String> colors = new ArrayList<String>();
		colors.add("Black");
		colors.add("Red");
		colors.add("White");
		colors.add(0, "Purple");
		
		for (String color : colors) {
			System.out.println(color);
		}
	}

}
