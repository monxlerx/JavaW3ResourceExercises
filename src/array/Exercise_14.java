package array;

import java.util.ArrayList;
import java.util.List;

public class Exercise_14 {

	public static void main(String[] args) {
		
		String[] words1 = {"car", "taxi", "truck", "plane", "football", "Thor", "hello"};
		String[] words2 = {"house", "taxi", "table", "plane", "soccer", "thor", "hello"};
		
		findCommonElements(words1, words2);
		
	}
	
	public static void findCommonElements (String[] values1, String[] values2) {
		
		List<String> elementsInCommon = new ArrayList<String>();
		
		for (int i=0; i<values1.length; i++) {
			for(int j=0; j<values2.length; j++) {
				if(values1[i] == values2[j]) {
					elementsInCommon.add(values1[i]);
				}
			}
		}
		
		for (String element: elementsInCommon) {
			System.out.println(element);
		}
	}

}
