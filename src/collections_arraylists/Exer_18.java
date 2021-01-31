package collections_arraylists;

import java.util.ArrayList;

public class Exer_18 {

	public static void main(String[] args) {

		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		
		System.out.println(c1);
		if (!c1.isEmpty()) {
			System.out.println("We have colors inside");
		}
		
		c1.clear();
		System.out.println(c1);
		if (c1.isEmpty()) {
			System.out.println("Colors are dissapeared");
		}
	}

}
