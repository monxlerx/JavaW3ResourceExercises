package method;

import java.util.Scanner;

public class Exercise_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password");
		String password = sc.nextLine();
		
		checkPassword(password);
	}

	public static void checkPassword(String password) {
		//Check if the password is correct
		int countDigit = 0;
		char[] passWordArray = password.toCharArray();
		for (int i=0; i<passWordArray.length; i++) {
			if(Character.isDigit(passWordArray[i])) {
				countDigit++;
			}
		}
		
		if (passWordArray.length >= 2 && passWordArray.length <= 10 && countDigit >= 2) {
			System.out.println("The password is correct");
		} else {
			System.out.println("The password is wrong");
		}
	}

}
