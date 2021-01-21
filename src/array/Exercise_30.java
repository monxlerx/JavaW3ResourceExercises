package array;

public class Exercise_30 {

	public static void main(String[] args) {

		Integer[] numbers = {2, 4, 3, 1, 5, -1};
		
		if (checkNumbersForbidden(numbers)) {
			System.out.println("Wrong numbers");
		} else {
			System.out.println("Everything is OK");
		}
	}
	
	public static boolean checkNumbersForbidden (Integer[] numbers) {
		boolean noValidNumbers = false;
		for (Integer number : numbers) {
			if (number == 0 || number == -1) {
				noValidNumbers = true;
			}
		}
		
		return noValidNumbers;
	}

}
