package lesson_05;

import java.util.Scanner;

public class Exercise_04 {

	public static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double[][] matrix = new double[4][4];
		double[] noteStudents = new double[4];
		double average;
		
		for (int line = 0; line < matrix.length; line++) {
			for (int column = 0; column < matrix[line].length; column++) {
				System.out.println("Insert 1st note");
				matrix[line][column] = read.nextDouble();
			}
		}
		
		
		for (int line = 0; line < matrix.length; line++) {
			
			double sum = 0d;
			
			for (int column = 0; column < matrix[line].length; column++) {
				
				sum += matrix[line][column];
			}
			
			average = (double) sum / 4;
			
			noteStudents[line] = average;
		}
		
		
		for (int i = 0; i < noteStudents.length; i++) {
			System.out.printf("%.2f ", noteStudents[i]);
		}
			
		

	}
	
}
