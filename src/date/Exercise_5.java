package date;

import java.util.Calendar;
import java.util.TimeZone;

public class Exercise_5 {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		
		System.out.println("Time in New York " + calendar.get(Calendar.HOUR_OF_DAY) + ":" 
						+ calendar.get(Calendar.MINUTE));
	}

}
