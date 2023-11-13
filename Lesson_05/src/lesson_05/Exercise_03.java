package lesson_05;

public class Exercise_03 {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] elementsOnMainDiagonal = new int[3];
		int[] elementsOnSecondDiagonal = new int[3];
		int sumMainDiagonal, sumSecondDiagonal;

		elementsOnMainDiagonal = findElementsOnMainDiagonal(matrix);
		elementsOnSecondDiagonal = findElementsOnSecondDiagonal(matrix);

		System.out.println("-- Elements on Main Diagonal -- ");

		for (int i : elementsOnMainDiagonal)
			System.out.println(i);

		System.out.println("-- Elements on Second Diagonal -- ");
		for (int i : elementsOnSecondDiagonal)
			System.out.println(i);

		sumMainDiagonal = sumArrayElements(elementsOnMainDiagonal);
		System.out.printf("Sum Elements on Main Diagonal: %d\n", sumMainDiagonal);
		sumSecondDiagonal = sumArrayElements(elementsOnSecondDiagonal);
		System.out.printf("Sum Elements on Second Diagonal: %d\n", sumSecondDiagonal);

	}

	public static int[] findElementsOnMainDiagonal(int[][] matrix) {

		int[] elementsOnMainDiagonal = new int[3];

		for (int index = 0; index < matrix.length; index++) {

			elementsOnMainDiagonal[index] = matrix[index][index];
		}

		return elementsOnMainDiagonal;
	}

	public static int[] findElementsOnSecondDiagonal(int[][] matrix) {

		int[] elementsOnSecondDiagonal = new int[3];

		for (int index = 0; index < matrix.length; index++) {

			elementsOnSecondDiagonal[index] = matrix[index][matrix.length - 1 - index];
		}
		
		return elementsOnSecondDiagonal;
	}

	private static int sumArrayElements(int[] array) {

		int sum = 0;

		for (var element : array) {
			sum += element;
		}

		return sum;

	}
}
