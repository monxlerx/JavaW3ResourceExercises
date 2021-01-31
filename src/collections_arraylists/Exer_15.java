package collections_arraylists;

import java.util.ArrayList;
import java.util.List;

public class Exer_15 {

	public static void main(String[] args) {
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");

		System.out.println(c1);
		
		List<String> c2 = new ArrayList<String>();
		c2.add("Magic Blue");
		c2.add("Cider green");
		c2.add("Bloody red");

		System.out.println(c2);
		
		c1.addAll(c2);
		
		System.out.println(c1);
	
	}

}
