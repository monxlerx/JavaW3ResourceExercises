package string;

public class Exercise_14 {

	public static void main(String[] args) {

		String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "stephen edwin king";

        System.out.println(str1 + " equals " + str2 + " ? " + str1.equalsIgnoreCase(str2));
        System.out.println(str1 + " equals " + str2 + " ? " + str1.equalsIgnoreCase(str3));
	}

}
