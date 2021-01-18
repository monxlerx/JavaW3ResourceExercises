package array;

public class Exercise_10 {

	public static void main(String[] args) {

		int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 493 };

		maxAndMinValue(my_array);
	}

	private static void maxAndMinValue(int[] my_array) {
		Integer max = Integer.MAX_VALUE;
		Integer min = Integer.MIN_VALUE;
		
		for (int i=0; i<my_array.length; i++) {
			if (my_array[i] > min) {
				min = my_array[i];
			} else if (my_array[i] < max) {
				max = my_array[i];
			}
		}
		
		System.out.println("The max is " + min + " and the min is " + max);
		
		
	}

}
