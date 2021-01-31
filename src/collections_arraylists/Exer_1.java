package collections_arraylists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Exer_1 {

	public static void main(String[] args) {

		List<String> colors = new ArrayList<String>();
		colors.add("Black");
		colors.add("White");
		colors.add("red");
		
		System.out.println(colors);
		
		for (String color : colors) {
			System.out.println(color);
		}
	}

}
