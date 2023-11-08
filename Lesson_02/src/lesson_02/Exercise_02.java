//Desenvolvedor: Antonio Bandeira
//Data: 08/11/2023
//Goal: Calculate Average

package lesson_02;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
	     
		Scanner read = new Scanner(System.in);
		
		float assessmentOne = 0f, assessmentTwo = 0f;
		float assessmentThree = 0f, assessmentFor = 0f;
		float average = 0f;
		int assessmentCount = 4;
		
		System.out.println("Enter your 1º Assessment: ");
		assessmentOne = read.nextFloat();
		
		System.out.println("Enter your 2º Assessment: ");
		assessmentTwo = read.nextFloat();
		
		System.out.println("Enter your 3º Assessment: ");
		assessmentThree = read.nextFloat();
		
		System.out.println("Enter your 4º Assessment: ");
		assessmentFor = read.nextFloat();

		//Calculating
		average = (assessmentOne + assessmentTwo + assessmentThree + assessmentFor) / assessmentCount;
		
		System.out.printf("Your average is %.2f", average);
	
		read.close();

	}

}
