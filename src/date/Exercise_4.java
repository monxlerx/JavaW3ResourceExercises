package date;

import java.util.Calendar;

public class Exercise_4 {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		
		int minYear = calendar.getActualMinimum(Calendar.YEAR);
		int minMonth = calendar.getActualMinimum(Calendar.MONTH);
		int minWeek = calendar.getActualMinimum(Calendar.WEEK_OF_YEAR);
		int date = calendar.getActualMinimum(Calendar.DATE);
		
		System.out.println(minYear);
		System.out.println(minMonth);
		System.out.println(minWeek);
		System.out.println(date);
		
	}

}
