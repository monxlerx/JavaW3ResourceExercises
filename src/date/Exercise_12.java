package date;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class Exercise_12 {

	public static void main(String[] args) {

		DateFormatSymbols symbols = new DateFormatSymbols(new Locale("es"));
		String[] dayNames = symbols.getWeekdays();
		
		for (String d : dayNames) {
			System.out.println(d);
		}
	}

}
