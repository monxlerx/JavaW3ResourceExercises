package array;

public class Exercise_28 {

	public static void main(String[] args) {

		Integer[] numbers = {2, 4, 5, 6, 6, 33, 55, 100};
		Integer smallestNumber = Integer.MAX_VALUE;
		Integer biggestNumber = Integer.MIN_VALUE;
		
		if (numbers.length > 1) {
			for (int i=0; i<numbers.length; i++) {
				if (numbers[i] < smallestNumber) {
					smallestNumber = numbers[i];
				} else if (numbers[i] > biggestNumber) {
					biggestNumber = numbers[i];
				}
			}
			
			System.out.println(Math.abs(Integer.valueOf(biggestNumber - smallestNumber)));
			
		} else {
			System.out.println("The array length must be 1 and above");
		}
	}

}
