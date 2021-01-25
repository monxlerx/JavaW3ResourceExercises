package date;

import java.time.LocalDate;

public class Exercise_21 {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println("Current date " + today);
		System.out.println("10 days before today will be " + today.plusDays(-10));
		System.out.println("10 days after today will be " + today.plusDays(10));

	}

}
