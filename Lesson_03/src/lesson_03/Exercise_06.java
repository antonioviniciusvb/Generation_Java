package lesson_03;

import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {
		
		String name;
		char office;
		float newSalary, salary, readjustment = 0f;

		Scanner read = new Scanner(System.in);

		System.out.println("What is your name?");
		name = read.nextLine();

		showTable();

		System.out.println("Enter your age group code");
		office = read.next().charAt(0);
		
		System.out.println("Enter your salary");
		salary = read.nextFloat();

		switch (office) {
		case '1':
			readjustment = 0.1f;
			break;
		case '2':
			readjustment = 0.07f;
			break;
		case '3':
			readjustment = 0.09f;
			break;
		case '4':
			readjustment = 0.06f;
			break;
		case '5':
			readjustment = 0.05f;
			break;
		case '6':
			readjustment = 0.08f;
			break;
		default:
			System.out.println("Invalid option");

		}
		
		newSalary = salary + (readjustment * salary);
		
		System.out.printf("Your new salary is %.2f", newSalary);

	}
	
	public static void showTable() {

		
		System.out.println("1- Manager - 10%");
		System.out.println("2- Salesperson - 7%");
		System.out.println("3- Supervisor - 9%");
		System.out.println("4- Driver - 6%");
		System.out.println("5- Stock - 5%");
		System.out.println("6- IT technician - 8%");
		
		System.out.println();

	}

}
