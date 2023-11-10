package lesson_04;

import java.util.Scanner;

public class Exercise_03 {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		int age = 0, countUnder21 = 0, countOver50 = 0;

		while (age >= 0) {
			
			System.out.println("*To exit, enter a negative value");
			System.out.println("How old are you?");
			age = read.nextInt();
			
			if(age > 0 && age <= 21) {
				countUnder21++;
			}
			
			if(age > 50) {
				countOver50++;
			}
		}

		System.out.printf("Total of people Under 21: %d\n", countUnder21);
		System.out.printf("Total of people Over 50: %d\n", countOver50);

	}

}
