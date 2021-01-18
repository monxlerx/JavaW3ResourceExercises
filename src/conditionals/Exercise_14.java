package conditionals;

import java.util.Scanner;

public class Exercise_14 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

        System.out.print("Input a natural number");
        int number = in.nextInt();
        
        for(int i=0; i <= number; i++) {
        	System.out.println (number + " x " + i + " = " + number * i);
        }
		
	}

}
