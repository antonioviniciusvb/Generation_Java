package lesson_05;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		String[] names = { "Antonio", "Vinicius", "Carlos", "Jóse", "Carla", "Andressa" };

		System.out.println("- Names, String Array");
		showArray(names);

		System.out.println("- Names, String Array, Order By Ascending Or Descending");
		Arrays.sort(names);

		showArray(names, "Name: ", false);

		System.out.println("Binary Search");
		System.out.println("Search - Vinicius: " + Arrays.binarySearch(names, "Vinicius"));

		float[] assessments = new float[3];

		for (int index = 0; index < assessments.length; index++) {
			System.out.printf("Enter your %drd assessment grade\n", index + 1);
			assessments[index] = read.nextFloat();
		}

		showArray(assessments);

		for (float assessment : assessments) {
			System.out.printf("Enter your assessment: %.2f\n", assessment);
		}
	}

	public static void showArray(String[] array, String message, boolean orderAscending) {

		int stop = array.length;
		int index = orderAscending ? 0 : array.length - 1;

		while (stop > 0) {

			System.out.printf("%s %s\n", message, array[index]);

			stop--;
			index = orderAscending ? index + 1 : index - 1;
		}
	}

	public static void showArray(String[] array) {

		for (int index = 0; index < array.length; index++) {
			System.out.println(array[index]);
		}
	}

	public static void showArray(float[] array) {

		for (int index = 0; index < array.length; index++) {
			System.out.println(array[index]);
		}
	}

}
