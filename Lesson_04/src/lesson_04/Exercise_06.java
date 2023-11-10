package lesson_04;

import java.util.Scanner;

public class Exercise_06 {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		int number, count = 0, sum = 0;
		double average = 0d;

		do {

			System.out.println("*Type zero for exit");
			System.out.println("Type a number");
			number = read.nextInt();
			
			if(number != 0 && number % 3 ==  0) {
				
				sum += number;
				count++;
			}

		} while (number != 0);
		
		
		//Average
		average = (double) sum / count; 
		
		System.out.printf("Average %.2f", average);

	}
}
