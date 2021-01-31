package method;

public class Exercise_1 {

	public static void main(String[] args) {

		int[] numbers = {25, 37, 29};
		System.out.println(findSmallest(numbers));
		
	}

	private static int findSmallest(int[] numbers) {
		int lowerNumber = 100;
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] < lowerNumber) {
				lowerNumber = numbers[i];
			}
		}
		return lowerNumber;
	}

}
