package array;

public class Exercise_4 {

	public static void main(String[] args) {

		float[] numbers = { 2, 10, 10 };
		averageValue(numbers);

	}

	private static void averageValue(float[] numbers) {
		float sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		System.out.println("The sum of all elements in the array " + (sum / numbers.length));
	}
}
