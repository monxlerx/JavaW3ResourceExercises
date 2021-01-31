package method;

import java.time.LocalDateTime;

public class Exercise_15 {

	public static void main(String[] args) {

		currentDateTime();
	}

	public static void currentDateTime () {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
	}
}
