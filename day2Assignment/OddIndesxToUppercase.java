package day2Assignment;

public class OddIndesxToUppercase {

	public static void main(String[] args) {
		
		String test = "changeme";
		char arr[] = test.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0)
				System.out.println("OddIndex To UpperCase is " + Character.toUpperCase(arr[i]));
		}
		
	}

}
