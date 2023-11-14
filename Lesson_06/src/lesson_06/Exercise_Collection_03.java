package lesson_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Exercise_Collection_03 {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		HashSet<Integer> numbers = new HashSet<Integer>();
		int tmpNumber;

		for (int i = 0; i < 10; i++) {

			System.out.println("Enter a non-repeating number");
			tmpNumber = read.nextInt();

			if (numbers.contains(tmpNumber)) {
				System.out.println("Repeated number enter another");
				continue;

			} else {

				// Add value
				numbers.add(tmpNumber);
			}
		}

		// Show number with Iterator

		System.out.println("---- Numbers of HashSet ----");
		Iterator<Integer> iNumber = numbers.iterator();

		while (iNumber.hasNext()) {
			System.out.println(iNumber.next());
		}

	}

}
