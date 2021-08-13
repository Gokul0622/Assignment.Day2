package day2Assignment;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
	
		int data[] = {3,2,11,4,6,7};
		int n;
		
		 n= data.length;
		 System.out.println("Length of Array is " + data.length);
		Arrays.sort(data);
		System.out.println("Second Largest Number is" + data[n-2]);

	}

}
