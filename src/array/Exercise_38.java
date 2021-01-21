package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise_38 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2));
		Integer majorityNumber  = findMajorityNumber(numbers);
		
		if (majorityNumber != -1) {
			System.out.println("The majority element is " + majorityNumber);
		} else {
			System.out.println("There is no majority element");
		}
		
	}
	
	
	public static Integer findMajorityNumber (List<Integer> numbers) {
		
		Map<Integer, Integer> appearencesNumbers = new HashMap<Integer, Integer>();
		Integer mostRepeatedNumber = 0;
		Integer mostFrequency = 0;
		
		for (Integer number : numbers) {
			if (appearencesNumbers.containsKey(number)) {
				appearencesNumbers.put(number, appearencesNumbers.get(number) + 1);
			} else {
				appearencesNumbers.put(number, 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : appearencesNumbers.entrySet()) {
			if (entry.getValue() > mostFrequency) {
				mostRepeatedNumber = entry.getKey();
				mostFrequency = entry.getValue();
			}
		}
		
		if (mostFrequency > (numbers.size()/2)) {
			return mostRepeatedNumber;
		} else {
			return -1;
		}
		
	}

}
