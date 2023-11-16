package lesson_07;

import java.util.Scanner;

public class Calculator {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		double numberOne, numberTwo, result;
		int operation;
		char operationDescription;

		do {

			showMenuOperations();
			operation = read.nextInt();

			if (operation == 0)
				break;
			
			System.out.println("\n------- Calculator -------");
			System.out.println("Enter a number:");
			numberOne = read.nextDouble();

			System.out.println("Enter a number:");
			numberTwo = read.nextDouble();

			result = calculate(numberOne, numberTwo, operation);
			operationDescription = getOperationDescription(operation);
			System.out.println("\n------- Result -------");
			System.out.printf("%.2f %s %.2f = %.2f\n\n", numberOne, operationDescription, numberTwo, result);

		} while (true);
		
		aboutProgram();
	}

	public static char getOperationDescription(int operation) {

		char operatorDescription = ' ';

		switch (operation) {
		case 1 -> operatorDescription = '+';
		case 2 -> operatorDescription = '-';
		case 3 -> operatorDescription = '*';
		case 4 -> operatorDescription = '/';
		}

		return operatorDescription;
	}

	public static double calculate(double numberOne, double numberTwo, int operation) {

		double result = 0.0d;

		switch (operation) {
		case 1 -> result = addition(numberOne, numberTwo);
		case 2 -> result = subtraction(numberOne, numberTwo);
		case 3 -> result = multiplication(numberOne, numberTwo);
		case 4 -> result = division(numberOne, numberTwo);
		default -> System.out.println("Invalid operation");
		}

		return result;
	}

	public static void showMenuOperations() {

		System.out.println("\n*********************\n");
		System.out.println("1- (+) Addition");
		System.out.println("2- (-) Subtraction");
		System.out.println("3- (*) Multiplication");
		System.out.println("4- (/) Division");
		System.out.println("0- Exit program");
		System.out.println("\n*********************\n");
		System.out.println("Choose a Operation:");
	}

	public static double addition(double numberOne, double numberTwo) {
		return numberOne + numberTwo;
	}

	public static double subtraction(double numberOne, double numberTwo) {
		return numberOne - numberTwo;
	}

	public static double multiplication(double numberOne, double numberTwo) {
		return numberOne * numberTwo;
	}

	public static double division(double numberOne, double numberTwo) {
		return numberOne / numberTwo;
	}

	public static void aboutProgram() {
		System.out.println("\nSoftware: Calculator");
		System.out.println("Developed by: Antonio Bandeira\n");
	}

}
