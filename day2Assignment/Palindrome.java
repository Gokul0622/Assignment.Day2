package day2Assignment;

public class Palindrome {

	public static void main(String[] args) {
	
		String str= "madam";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
			if (str.equalsIgnoreCase(rev)) 
				System.out.println("It is Palindrome");
				else
					System.out.println("Not a Palindrome" );
			}
		}
			
		
		
	
