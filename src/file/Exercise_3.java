package file;

import java.io.File;
import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {

		 // Create a File object
        File my_file_dir = new File("/home/students/xyz.txt");
         if (my_file_dir.exists()) 
           {
            System.out.println("The directory or file exists.\n");
           } 
         else
          {
            System.out.println("The directory or file does not exist.\n");
          }
       }
}