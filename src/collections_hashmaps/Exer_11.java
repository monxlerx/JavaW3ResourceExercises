package collections_hashmaps;

import java.util.HashMap;
import java.util.Set;


public class Exer_11 {

	public static void main(String[] args) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		
		Set keyset = hash_map.keySet();
		System.out.println("Key set values are " + keyset);
	}

}
