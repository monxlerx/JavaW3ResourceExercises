package date;

import java.time.LocalDate;
import java.time.Period;

public class Exercise_32 {

	public static void main(String[] args) {

		LocalDate myBirth = LocalDate.of(1984, 06, 05);
		LocalDate now = LocalDate.now();
		
		Period diff = Period.between(myBirth, now);
				
		System.out.println(diff.getYears());
		System.out.println(diff.getMonths());
		System.out.println(diff.getDays());
		
	}

}
