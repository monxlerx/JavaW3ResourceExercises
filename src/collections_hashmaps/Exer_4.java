package collections_hashmaps;

import java.util.HashMap;

public class Exer_4 {

	public static void main(String[] args) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		
		System.out.println(hash_map);
		
		hash_map.clear();
		
		System.out.println(hash_map);
	}

}
