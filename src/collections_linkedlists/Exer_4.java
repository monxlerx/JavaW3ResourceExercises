package collections_linkedlists;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Exer_4 {

	public static void main(String[] args) {

		// create an empty linked list
		LinkedList<String> l_list = new LinkedList<String>();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("White");
		l_list.add("Pink");
		l_list.add("Yellow");
		
		System.out.println(l_list);
		
		Collections.reverse(l_list);
		
		System.out.println(l_list);
	}

}
