package method;

public class Exercise_6 {

	public static void main(String[] args) {
		Integer number = 453;
		System.out.println(sumDigits(number));
	}
	
	public static int sumDigits (Integer number) {
		int sum = 0;
	    while (number != 0)
	    {
	        sum += number %10;
	        number = number /10;
	    }
	    return sum;
	}

}
