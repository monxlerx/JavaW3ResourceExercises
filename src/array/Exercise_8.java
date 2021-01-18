package array;

import java.lang.reflect.Array;

public class Exercise_8 {

	public static void main(String[] args) {

		int[] arrayA = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		
		int[] arrayB = copyArray(arrayA);
		
		for (int i=0; i<arrayB.length; i++) {
			System.out.print(arrayB[i] + " - ");
		}
	}
	
	public static int[] copyArray (int[] array) {
		int[] copyArr = new int[array.length];
		for (int i=0; i<array.length; i++) {
			copyArr[i] = array[i];
		}
		return copyArr;
	}

}
