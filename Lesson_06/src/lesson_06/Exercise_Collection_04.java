package lesson_06;

import java.util.HashSet;
import java.util.Scanner;

public class Exercise_Collection_04 {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		HashSet<Integer> numbers = new HashSet<Integer>();
		int numberToFind;

		// Add Values
		numbers.add(2);
		numbers.add(5);
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(9);
		numbers.add(7);
		numbers.add(8);
		numbers.add(10);
		numbers.add(6);

		System.out.println("Number to find?");
		numberToFind = read.nextInt();

		if (numbers.contains(numberToFind)) {
			System.out.printf("Number [%d] was found.", numberToFind);
		} else {

			System.out.println("Number not found");
		}

	}

}
