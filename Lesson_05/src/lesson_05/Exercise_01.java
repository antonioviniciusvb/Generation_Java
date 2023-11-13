package lesson_05;

import java.util.Scanner;

public class Exercise_01 {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		int[] numbers = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int find, findResult = -1;

		System.out.println("Find a number");
		find = read.nextInt();

		for (int index = 0; index < numbers.length; index++) {

			if (numbers[index] == find) {

				findResult = index;
				break;
			}
		}

		if (findResult >= 0)

			System.out.printf("The number: %d is in the index: %d\n", numbers[findResult], findResult);

		else
			System.out.println("Number not found");

	}

}
