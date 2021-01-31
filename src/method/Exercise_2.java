package method;

public class Exercise_2 {

	public static void main(String[] args) {
		int[] numbers = { 253, 37, 29 };
		System.out.println(findAverageNumber(numbers));

	}

	private static float findAverageNumber(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		float average = sum / numbers.length;
		
		return average;
	}

}
