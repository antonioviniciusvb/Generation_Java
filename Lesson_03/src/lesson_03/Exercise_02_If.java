package lesson_03;

import java.util.Scanner;

public class Exercise_02_If {

	public static void main(String[] args) {

		int number;
		String oddOrEven, isNegative;

		Scanner read = new Scanner(System.in);

		System.out.println("Enter a number");
		number = read.nextInt();

		//Is it an odd or even number?
		oddOrEven = (number % 2) == 0 ? "even" : "odd"; 
		
		//Is a negative number?
		isNegative = number < 0 ? "yes": "no";
		
		System.out.println();
		System.out.printf("** Number %d **\n", number);
		System.out.printf("Is a odd or even? %s\n", oddOrEven);
		System.out.printf("Is a negative? %s", isNegative);
		
		
		
		read.close();

	}

}
