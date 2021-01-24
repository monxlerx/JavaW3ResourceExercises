package string;

import java.util.HashMap;
import java.util.Map;

public class Exercise_38 {

	public static void main(String[] args) {
		
		String word = "w3resource";
		System.out.println(word);
		System.out.println(removeDuplicateChars(word));		
	}

	public static String removeDuplicateChars(String word) {
		char[] wordArray = word.toCharArray();
		String targetStr = "";
		
		for (char value : wordArray) {
			if (targetStr.indexOf(value) == -1) {
				targetStr += value;
			}
		}
		
		return targetStr;
	}

}
