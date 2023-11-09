package lesson_03;

import java.util.Scanner;

public class HealthPlan {

	public static void main(String[] args) {

		String name;
		char ageRange = 0;
		double costPlan = 0d;

		Scanner read = new Scanner(System.in);

		System.out.println("What is your name?");
		name = read.nextLine();

		showTableRange();

		System.out.println("Enter your age group code");
		ageRange = read.next().charAt(0);

		switch (ageRange) {
		case '1':
			costPlan = 100;
			break;
		case '2':
			costPlan = 200;
			break;
		case '3':
			costPlan = 300;
			break;
		case '4':
			costPlan = 500;
			break;
		case '5':
			costPlan = 600;
			break;
		case '6':
			costPlan = 1000;
			break;
		default:
			System.out.println("Invalid option");

		}
		
		// Show Cost Health Plan 
		if (costPlan > 0) {
			System.out.println(name);
			System.out.printf("Your cost health plan is %.2f", costPlan);
		}

		read.close();

	}

	public static void showTableRange() {

		System.out.println("Age range");
		System.out.println("1- Less 10 years old");
		System.out.println("2- 11 to 29 years old");
		System.out.println("3- 30 to 45 years old");
		System.out.println("4- 46 to 59 years old");
		System.out.println("5- 60 to 65 years old");
		System.out.println("6- Over 65 years old");
		System.out.println();

	}

}
