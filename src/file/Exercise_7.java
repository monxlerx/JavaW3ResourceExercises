package file;

import java.io.File;

public class Exercise_7 {

	public static void main(String[] args) {

		File my_file_dir = new File("/home/students/abc.txt");
		long lastModifiedTime = my_file_dir.lastModified();
		
		System.out.println("Last time the file was modified " + lastModifiedTime);
	}

}
