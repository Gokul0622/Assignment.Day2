package day2Assignment;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2md Class of Automation $$";
		int letter=0, space=0, num=0, speacialChar =0;
		char[]arr = test.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(Character.isLetter(arr[i])) {
				letter++;
				
			}
			else if(Character.isSpaceChar(arr[i])) {
				space++;
				
				
			}
			else if(Character.isDigit(arr[i])) {
				num++;
			}
			else {
				special++;
			}
			
		}
		
		
	}

}
