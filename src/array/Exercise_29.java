package array;

public class Exercise_29 {

	public static void main(String[] args) {

		Integer[] numbers = {2, 4, 3, 1, 5};
		Integer smallestNumber = Integer.MAX_VALUE;
		Integer biggestNumber = Integer.MIN_VALUE;
		Integer sum = 0;
		
		if (numbers.length > 1) {
			
			for (int i=0; i<numbers.length; i++) {
				if (numbers[i] < smallestNumber) {
					smallestNumber = numbers[i];
				} else if (numbers[i] > biggestNumber) {
					biggestNumber = numbers[i];
				} 
			}
			
			for (int j=0; j<numbers.length; j++) {
				if (numbers[j] != smallestNumber && numbers[j] != biggestNumber)
					sum += numbers[j];
			}
			
			System.out.println("The average is " + (float)(sum / numbers.length));

		} else {
			System.out.println("The array length must be 1 and above");
		}
		
	}

}
