package day2Assignment;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator calculate = new Calculator();
		 System.out.println( " Addition Value is " + calculate.add(55, 20, 25));
		 System.out.println(" Subraction value is " + calculate.sub(50, 25));
		 System.out.println(" Multiplication Value is " + calculate.mul(12.56988, 1.5984457));
		 System.out.println(" Division value is " + calculate.div(15.5f, 25.36f));
		
}
}