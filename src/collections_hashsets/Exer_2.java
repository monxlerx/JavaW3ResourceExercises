package collections_hashsets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exer_2 {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("Red");
		colors.add("Black");
		colors.add("Ambar");
		colors.add("Purple");
		colors.add("Brown");
		
		Iterator i = colors.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
