package collections_linkedlists;

import java.util.LinkedList;

public class Exer_24 {

	public static void main(String[] args) {

		LinkedList<String> c1= new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        LinkedList<String> c2= new LinkedList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Orange");
        
        LinkedList<String> c3 = new LinkedList<String>();
        for (String element : c1) {
        	c3.add(c2.contains(element) ? "Yes" : "No");
        }
        
        System.out.println(c3);
	}

}
