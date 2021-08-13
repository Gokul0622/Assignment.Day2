package day2Assignment;

import java.util.Arrays;

public class MissingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5,  7, 8 };
		Arrays.sort(arr);
		System.out.println("Total Arrays" + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				System.out.println(" Missing Number is " +  (i + 1));
				break;
			}

		}

	}

}
