package collections_linkedlists;

import java.util.Iterator;
import java.util.LinkedList;

public class Exer_3 {

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
		
		Iterator p = l_list.listIterator(1);
		
		while (p.hasNext()) {
			System.out.println(p.next());
		}
		
	}

}
