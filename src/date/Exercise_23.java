package date;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

public class Exercise_23 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);

		System.out.println("Months remaining until the end of the year are: " + (11 - month));

		LocalDate today = LocalDate.now();
		LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
		Period period = today.until(lastDayOfYear);
		System.out.println();
		System.out.println("Months remaining in the year: " + period.getMonths());
		System.out.println();
	}

}
