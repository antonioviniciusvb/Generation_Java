package lesson_04;

import java.util.Scanner;

public class Exercise_01 {

	public static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numberOne, numberTwo;
		
		System.out.println("Enter first value");
		numberOne = read.nextInt();
		
		System.out.println("Enter second value");
		numberTwo = read.nextInt();
		
		if(numberOne < numberTwo) {
			
			for(int number = numberOne; number <= numberTwo; number++) {
				
				if(number == 0)
					continue;
				
				if((number % 3 == 0) && (number % 5 == 0)) {
					
					System.out.printf("%d is a multiple of 3 and 5\n", number);
				}
				
			}
			
			
		}else {
			System.out.println("Invalid range!");
			System.out.println("The first number must be less than the second");
		}
	}

}
