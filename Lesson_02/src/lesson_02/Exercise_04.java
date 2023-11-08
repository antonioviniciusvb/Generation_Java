//Developer: Antonio Bandeira
//Data: 08/11/2023

package lesson_02;

import java.util.Scanner;

public class Exercise_04 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double n1 = 0d, n2 = 0d, n3 = 0d, n4 = 0d, diff = 0d;
		
		System.out.println("Enter a value for n1: ");
		n1 = read.nextDouble();
		
		System.out.println("Enter a value for n2: ");
		n2 = read.nextDouble();

		System.out.println("Enter a value for n3: ");
		n3 = read.nextDouble();
		
		System.out.println("Enter a value for n4: ");
		n4 = read.nextDouble();
		
		//Calculating
		diff = (n1 * n2) - (n3 * n4);
		
		System.out.printf("Diff is %.2f", diff);
		
		read.close();

	}

}
