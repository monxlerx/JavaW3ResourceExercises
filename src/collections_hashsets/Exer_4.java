package collections_hashsets;

import java.util.HashSet;
import java.util.Set;

public class Exer_4 {

	public static void main(String[] args) {

		Set<String> colors = new HashSet<String>();
		colors.add("Red");
		colors.add("Black");
		colors.add("Ambar");
		colors.add("Purple");
		colors.add("Brown");
		
		System.out.println(colors);
		
		colors.removeAll(colors);
		
		System.out.println(colors);
		
	}

}
