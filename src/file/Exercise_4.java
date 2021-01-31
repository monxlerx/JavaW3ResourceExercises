package file;

import java.io.File;

public class Exercise_4 {

	public static void main(String[] args) {

		File myFileDir = new File("/Usuarios/noel/prueba/abc.txt");
		boolean canRead = myFileDir.canRead();
		boolean canWrite = myFileDir.canWrite();
		
		if (canRead) {
			System.out.println(myFileDir.getAbsolutePath() + " The file can read");
		} else {
			System.out.println(myFileDir.getAbsolutePath() + " The file cannot read");
		}
		
		if (canWrite) {
			System.out.println(myFileDir.getAbsolutePath() + " The file can write");
		} else {
			System.out.println(myFileDir.getAbsolutePath() + " The file cannot write");
		}
	}

}
