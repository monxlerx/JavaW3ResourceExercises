package method;

public class Exercise_5 {

	public static void main(String[] args) {
		String phrase = "The quick brown fox jumps over the lazy dog";
		countAllWords(phrase);
	}

	private static void countAllWords(String phrase) {

		int countWords = 0;
		char[] phraseArray = phrase.toCharArray();

		for (int i = 0; i < phraseArray.length; i++) {
			if (phraseArray[i] == ' ') {
				countWords++;
			}
		}

		countWords += 1;
		
		System.out.println("Number of vowels in the string " + countWords);
	}

}
