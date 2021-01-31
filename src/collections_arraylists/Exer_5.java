package collections_arraylists;

import java.util.ArrayList;
import java.util.List;

public class Exer_5 {

	public static void main(String[] args) {
		
		List<String> colors = new ArrayList<String>();
		colors.add("Black");
		colors.add("Red");
		colors.add("White");
		colors.add(0, "Purple");
		
		System.out.println(colors);
		
		colors.set(2, "Apple green");
		
		System.out.println(colors);
		
		colors.add(2, "Snow white");
		
		System.out.println(colors);

	}

}
