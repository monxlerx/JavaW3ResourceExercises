package date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

public class Exercise_27 {

	public static void main(String[] args) {

	LocalTime time = LocalTime.of(12,24,32); 
	int hour = time.getHour();
	int minute = time.getMinute();
	int second = time.getSecond();
	
	System.out.println(hour);
	System.out.println(minute);
	System.out.println(second);
		
	}
}
