package collections_arraylists;

import java.util.ArrayList;
import java.util.List;

public class Exer_12 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		
		System.out.println("List1: " + list1);
		
		List<String> subList = list1.subList(0, 2);
		
		System.out.println(subList);
	}

}
