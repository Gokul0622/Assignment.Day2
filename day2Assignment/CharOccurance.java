package day2Assignment;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "Welcome to chennai";
		char searchchar = 'e';
		int count = 0;
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchchar) {
				count++;
			}

		}
		System.out.println(" CharOfccurance is " + count);

	}

}
