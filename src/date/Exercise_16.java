package date;

import java.util.Calendar;
import java.util.Date;

public class Exercise_16 {

	public static void main(String[] args) {

		int numberOfDays = 14;
		Calendar cal = Calendar.getInstance();
		Date cDate = cal.getTime();
		cal.add(Calendar.DAY_OF_YEAR, numberOfDays);
		Date dte = cal.getTime();
		System.out.println(cDate);
		System.out.println(dte);
		
	}

}
