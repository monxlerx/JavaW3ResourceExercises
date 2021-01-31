package collections_hashsets;

import java.util.HashSet;
import java.util.Set;

public class Exer_6 {

	public static void main(String[] args) {

		// Create a empty hash set
		HashSet<String> h_set = new HashSet<String>();
		
		// use add() method to add values in the hash set
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		
		System.out.println("Original Hash Set: " + h_set);
		
		HashSet<String> new_h_set = new HashSet<String>();
		new_h_set = (HashSet) h_set.clone();
		
		System.out.println("Cloned Hash Set: " + new_h_set);

	}

}
