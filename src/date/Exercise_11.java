package date;

import java.util.Calendar;

public class Exercise_11 {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		int numberDaysMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(numberDaysMonth);
	}

}
