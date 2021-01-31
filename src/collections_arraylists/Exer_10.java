package collections_arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exer_10 {

	public static void main(String[] args) {

		List<String> List1 = new ArrayList<String>();
		List1.add("1");
		List1.add("2");
		List1.add("3");
		List1.add("4");
		
		System.out.println("List1: " + List1);
		
		Collections.shuffle(List1);
		
		System.out.println(List1);
	}

}
