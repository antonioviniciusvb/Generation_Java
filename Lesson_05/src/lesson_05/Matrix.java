package lesson_05;

import java.util.Scanner;

public class Matrix {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrixIrregular = { { 1, 2, 3 }, { 4, 5, 6 } };
		double[][] numbers = new double[3][3];

		System.out.println("---- Matrix ----");

		for (int line = 0; line < matrix.length; line++) {
			for (int column = 0; column < matrix[line].length; column++) {
				System.out.printf("Matrix[%d][%d]: %d\n", line, column, matrix[line][column]);
			}
		}

		System.out.println("---- Matrix Irregular - For ----");

		for (int line = 0; line < matrixIrregular.length; line++) {
			for (int column = 0; column < matrixIrregular[line].length; column++) {
				System.out.printf("Matrix[%d][%d]: %d\n", line, column, matrixIrregular[line][column]);
			}
		}

		System.out.println("---- Matrix Irregular - Foreach ----");

		for (var array : matrixIrregular) {
			for (int element : array) {
				System.out.printf("Matrix: %d\n", element);
			}
		}

		System.out.println("---- Input ----");

		for (int line = 0; line < numbers.length; line++) {
			for (int column = 0; column < numbers[line].length; column++) {

				System.out.printf("Matrix[%d][%d]:\n", line, column);
				numbers[line][column] = read.nextDouble();
			}
		}

		for (int line = 0; line < numbers.length; line++) {
			for (int column = 0; column < numbers[line].length; column++) {
				System.out.printf("Matrix[%d][%d]: %.2f\n", line, column, numbers[line][column]);
			}
		}

	}

}
