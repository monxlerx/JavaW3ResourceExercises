package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise_29 {

	public static void main(String[] args) {

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format.format(new Date()));
	}

}
