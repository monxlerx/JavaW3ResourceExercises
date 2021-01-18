package conditionals;

import java.util.Scanner;

public class Exercise_13 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

        System.out.print("Input a natural number");
        int number = in.nextInt();
        
        for(int i = 1; i <= number; i++) {
        	System.out.println("Number is : " + i + " and cube of " + i + " is : " + Math.round(Math.pow(i, 3)));
        }
        
		
		
	}

}
