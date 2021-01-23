package string;

public class Exercise_5 {

	public static void main(String[] args) {

		String first = "This is Exercise 1";                                                                                  
		String second = "This is Exercise 2";
		
		if (first.compareTo(first) == 0 && first.length() == second.length()) {
			System.out.println("They are equals");
		} else {
			System.out.println("They are not equals");
		}
	}

}
