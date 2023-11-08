package lesson_02;

public class Types {

	public static void main(String[] args) {
		
		//Min size of types basics
		System.out.println("***** Types Basics Min Value *****");
		System.out.println("Byte: " + Byte.MIN_VALUE);
		System.out.println("Short: " + Short.MIN_VALUE);
		System.out.println("Int: " + Integer.MIN_VALUE);
		System.out.println("Long: " + Long.MIN_VALUE);
		System.out.println("Float: " + Float.MIN_VALUE);
		System.out.println("Double: " + Double.MIN_VALUE);
		
		System.out.println();
	
		//Max size of types basics				
		System.out.println("***** Types Basics Max Value *****");
		System.out.println("Byte: " + Byte.MAX_VALUE);
		System.out.println("Short: " + Short.MAX_VALUE);
		System.out.println("Int: " + Integer.MAX_VALUE);
		System.out.println("Long: " + Long.MAX_VALUE);
		System.out.println("Float: " + Float.MAX_VALUE);
		System.out.println("Double: " + Double.MAX_VALUE);
		
		
		//Values
		byte month = 12;
		short year = 2023;
		int day = 360000;
		long money = 120145687919l;
		float debit = 30.45f;
		double budget = 145200256555.4552d;
		char character = 'B';

		System.out.println();
		System.out.println("***** Testing Values *****");
		System.out.println("Month - Byte: " + month);
		System.out.println("Year - Short: " + year);
		System.out.println("Day - Int: " + day);
		System.out.println("Money - Long: " + money);
		System.out.println("Debit - Float: " + debit);
		System.out.println("Budget - Double: " + budget);
		System.out.println("Character - Char: " + character);
		
		
		
				
	}

}
