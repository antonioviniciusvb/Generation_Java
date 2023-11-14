package lesson_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_Collection_02 {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int numberToFind, indexOfNumber;

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

		indexOfNumber = numbers.indexOf(numberToFind);
		
		if(indexOfNumber >= 0) {
			System.out.printf("Number [%d] is position [%d]", numberToFind, indexOfNumber);
		}else {
			
			System.out.println("Number not found");
		}
		

	}

}
