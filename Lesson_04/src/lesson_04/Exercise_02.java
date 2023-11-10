package lesson_04;

import java.util.Scanner;

public class Exercise_02 {

	public static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int countEven = 0, countOdd = 0,  number;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Enter a number");
			number = read.nextInt();
			
			if(isEven(number)) 
				countEven++;
			else
				countOdd++;
		}
		
		
		System.out.printf("Total Even: %d\n", countEven);
		System.out.printf("Total Odd: %d\n", countOdd);
		
		

	}
	
	
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

}
