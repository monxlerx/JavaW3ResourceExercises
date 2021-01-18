package array;

public class Exercise_2 {

	public static void main(String[] args) {

		int[] numbers = {4, 5, 6, 3, 1, 10};
		sumNumbers(numbers);
		
	}

	private static void sumNumbers(int[] numbers) {
		int sum = 0;
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		
		System.out.println("The sum of all elements in the array " + sum);
	}
	
}
