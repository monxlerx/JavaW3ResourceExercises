package array;

import java.util.ArrayList;
import java.util.List;

public class Exercise_31 {

	public static void main(String[] args) {

		Integer[] numbers = {20, 20, 30, 40, 50, 50, 50};
		List<Integer> nums = new ArrayList<Integer>();
		
		
		for (Integer n : numbers) {
			if (!nums.contains(n)) {
				nums.add(n);
			}
		}
		
		System.out.println("The lenght of the array is " + nums.size());
		
	}

}
