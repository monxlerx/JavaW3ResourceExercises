package file;

import java.io.File;

public class Exercise_1 {

	public static void main(String[] args) {

		File myFileDir = new File("/Usuarios/noel/prueba");
		if (myFileDir.exists()) {
			System.out.println("Directory or file exists");
		} else {
			System.out.println("No, it does not exist");
		}
	}

}
