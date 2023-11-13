package lesson_05;

public class Exercise_02 {

	public static void main(String[] args) {
		
		int[] numbers = {2,5,1,3,4,9,7,8,10,6};
		int sumArrayElements = 0;
		double average = 0d;
		
		showArray(numbers, "--- Number of Array ---");
		showOddIndexes(numbers, "--- Even indexes of the Array ---");
		showEvenIndexesArray(numbers, "--- Odd indexes of the Array ---");
		sumArrayElements = sumArrayElements(numbers);
		average = (double) sumArrayElements / numbers.length;
		
		System.out.printf("Sum Array Elements: %d\n", sumArrayElements);
		System.out.printf("Average Array: %.2f\n", average);
		
	}
	
	private static int sumArrayElements(int[] array) {
		
		int sum = 0;
		
		for (var element : array) {
			sum += element;
		}
		
		return sum;
		
	}

	public static void showArray(int[] array, String message) {

		System.out.println(message);
		
		for (int index = 0; index < array.length; index++) {
			System.out.println(array[index]);
		}
	}

	
	public static void showEvenIndexesArray(int[] array, String message) {

		System.out.println(message);
		
		for (int index = 0; index < array.length; index++) {
			
			if(array[index] % 2 == 0)
				System.out.println(array[index]);
		}
	}
	
	public static void showOddIndexes(int[] array, String message) {

		System.out.println(message);
		
		for (int index = 0; index < array.length; index++) {
			
			if(!(index % 2 == 0))
				System.out.println(array[index]);
		}
	}

}
