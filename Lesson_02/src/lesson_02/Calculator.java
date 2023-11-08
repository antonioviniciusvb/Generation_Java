/*
* Developer: Antonio Bandeira
* Date: 08/11/2023
* Task: Create basic calculator
*/


package lesson_02;

import java.util.Scanner;

public class Calculator {

	// Global variable to read input
	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		double valueOne = 0d, valueTwo = 0d, result = 0d;
		char operator;

		//Get Value One
		System.out.println("----- Calculator -----");
		System.out.println("1º Number: ");
		valueOne = read.nextDouble();

		//Get Value Two
		System.out.println("2º Number: ");
		valueTwo = read.nextDouble();

		//Show Operations
		System.out.println("Operações:");
		System.out.println("(+) Soma");
		System.out.println("(-) Subtração");
		System.out.println("(*) Multiplicação");
		System.out.println("(/) Divisão");
		System.out.println("(0) Cancelar");
		operator = read.next().charAt(0);

		//Calculating...
		switch (operator) {

		case '+':
			result = valueOne + valueTwo;
			break;

		case '-':
			result = valueOne - valueTwo;
			break;
		case '*':
			result = valueOne * valueTwo;
			break;
		case '/':
			result = valueOne / valueTwo;
			break;

		case 0:
		default:
			break;
		}

		//Show Result
		System.out.println("----- Resultado -----");
		System.out.printf("%.2f %s %.2f = %.2f", valueOne, operator, valueTwo, result);

	}

}
