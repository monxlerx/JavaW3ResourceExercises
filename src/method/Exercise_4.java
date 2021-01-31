package method;

public class Exercise_4 {

	public static void main(String[] args) {
		String word = "w3resource";
		countAllVowels(word);
	}

	private static void countAllVowels(String word) {

		int countVowels = 0;
		char[] wordArray = word.toCharArray();
		
		for (int i=0; i<wordArray.length; i++) {
			if (wordArray[i] == 'a' || wordArray[i] == 'e' || wordArray[i] == 'i' 
					|| wordArray[i] == 'o' || wordArray[i] == 'u' ) {
				countVowels++;
			}
		}
		
		System.out.println("Number of vowels in the string " + countVowels);
	}

}
