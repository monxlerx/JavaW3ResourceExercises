package string;

public class Exercise_44 {

	public static void main(String[] args) {

		String phrase = "The quick brown fox jumps";
		reversePhrase(phrase);
	}
	
	public static void reversePhrase(String phrase) { 	
		char[] copyPhrase = phrase.toCharArray();
		for (int i = phrase.length() - 1; i >= 0; i--) {
			System.out.print(copyPhrase[i]);
		}
	}

}
