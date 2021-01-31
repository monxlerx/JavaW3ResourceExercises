package collections_hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Exer_1 {

	public static void main(String[] args) {

		HashMap<String,String> maps = new HashMap<String,String>();
		maps.put("Noel", "71879891S");
		
		for (Map.Entry x : maps.entrySet()) {
			System.out.println(x.getKey() + "-" + x.getValue());
		}
	}

}
