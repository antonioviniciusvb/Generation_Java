package lesson_03;

import java.util.Scanner;

public class HealthPlan {

	public static void main(String[] args) {

		String name;
		int age = 0;
		double costPlan = 0d;

		Scanner read = new Scanner(System.in);

		System.out.println("What is your name?");
		name = read.nextLine();

		System.out.println("How old are you?");
		age = read.nextInt();

		if (age > 0 && age <= 10) {
			costPlan = 100;
		} else if (age > 10 && age <= 29) {
			costPlan = 200;
		} else if (age > 29 && age <= 45) {
			costPlan = 300;
		} else if (age > 45 && age <= 59) {
			costPlan = 500;
		} else if (age > 59 && age <= 65) {
			costPlan = 600;
		} else if (age > 65 && age <= 130) {
			costPlan = 1000;
		} else {
			System.out.println("Age must be greater than 0 and less than 130.");
		}
		
		System.out.printf("%s, cost health plan is %.2f", name, costPlan);

		read.close();

	}

}
