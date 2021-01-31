package collections_hashsets;

import java.util.HashSet;
import java.util.Set;

public class Exer_3 {

	public static void main(String[] args) {
		
		Set<String> colors = new HashSet<String>();
		colors.add("Red");
		colors.add("Black");
		colors.add("Ambar");
		colors.add("Purple");
		colors.add("Brown");
		
		System.out.println("The size of the hashset is " + colors.size());
	}

}
