package lesson_04;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int number, resultMult, count = 1;

		System.out.println("Choose a number to multiply");
		number = read.nextInt();

		while (count <= 10) {
			resultMult = count * number;
			System.out.printf("%d * %d = %d\n", number, count, resultMult);
			count++;
		}

		read.close();

	}

}
