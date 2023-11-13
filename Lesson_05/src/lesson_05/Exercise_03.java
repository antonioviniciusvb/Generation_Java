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

		int indexFind = 0, indexMatrix = 0;
		int[] elementsOnMainDiagonal = new int[3];

		for (int line = 0; line < matrix.length; line++) {

			for (int column = 0; column < matrix[line].length; column++) {

				if (column == indexFind) {

					if (indexMatrix + 1 > elementsOnMainDiagonal.length - 1) {

						elementsOnMainDiagonal[indexMatrix] = matrix[line][column];
						break;
					}

					indexFind++;

					elementsOnMainDiagonal[indexMatrix++] = matrix[line][column];

					break;
				}
			}
		}

		return elementsOnMainDiagonal;
	}

	public static int[] findElementsOnSecondDiagonal(int[][] matrix) {

		int indexFind = matrix.length - 1, indexMatrix = 0;
		int[] elementsOnSecondDiagonal = new int[3];

		for (int line = 0; line < matrix.length; line++) {

			for (int column = matrix[line].length; column >= 0; column--) {

				if (column == indexFind) {

					if (indexMatrix + 1 > elementsOnSecondDiagonal.length - 1) {

						elementsOnSecondDiagonal[indexMatrix] = matrix[line][column];
						break;
					}

					indexFind--;

					elementsOnSecondDiagonal[indexMatrix++] = matrix[line][column];

					break;
				}
			}
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
