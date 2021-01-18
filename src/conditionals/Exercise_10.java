package conditionals;

import java.util.Scanner;

public class Exercise_10 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

        System.out.print("Input a natural number");
        int number = in.nextInt();
        
        int suma = 0;
        
        for(int i=1; i<=number; i++) {
        	System.out.println(i);
        	suma += i;
        }
        
        System.out.println("The Sum of Natural Number " + number +  " terms ");
        System.out.println(suma);
        
        
	}

}
