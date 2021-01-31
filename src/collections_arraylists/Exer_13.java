package collections_arraylists;

import java.util.ArrayList;
import java.util.List;

public class Exer_13 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		
		System.out.println("List1: " + list1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		
		System.out.println(list2);
		
		if (list1.equals(list2)) {
			System.out.println("They are equals");
		} else {
			System.out.println("No, they are not equals");
		}
		
	}

}
