package lesson_04;

import java.util.Scanner;

public class Exercise_05 {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		int number, sum = 0;

		do {

			System.out.println("*Type zero for exit");
			System.out.println("Type a number");
			number = read.nextInt();
			
			if(number > 0)
				sum += number;

		} while (number != 0);
		
		System.out.printf("Sum: %d", sum);

	}

}
