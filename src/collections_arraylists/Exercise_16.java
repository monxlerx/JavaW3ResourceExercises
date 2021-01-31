package collections_arraylists;

import java.util.ArrayList;
import java.util.List;

public class Exercise_16 {

	public static void main(String[] args) {

		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");

		System.out.println(c1);
		
		List<String> c2 = (List<String>) c1.clone();
		
		System.out.println(c2);
		
	}

}
