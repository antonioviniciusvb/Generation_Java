//Developer: Antonio Bandeira
//Data: 08/11/2023

package lesson_02;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		//As I recommend in the exercise, I will be using float
		float salary = 0f, bonus = 0f, newSalary = 0f;

		try {

			System.out.println("Enter your Salary: ");
			salary = read.nextFloat();

			System.out.println("Enter your Bonus: ");
			bonus = read.nextFloat();

			newSalary = salary + bonus;

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

		System.out.printf("Your new Salary is %.2f", newSalary);

		read.close();
	}

}
