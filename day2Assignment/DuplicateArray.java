package day2Assignment;

public class DuplicateArray {

	public static void main(String[] args) {
		int arr[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		System.out.println(" Length of Array " + arr.length);
		int count;
		for(int i=0;i<arr.length; i++) {
			count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(" Duplicate Array NUmber is "+ arr[i]);
				}
			}
			
		}
		
	}

}
