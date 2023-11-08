package lesson_02;

import java.util.Scanner;

public class Exercise_03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		float grossSalary = 0f, nightAdditional = 0f;
		float deduction = 0f, overtime = 0f, liquidSalary = 0f;
		
		System.out.println("Your Gross Salary: ");
		grossSalary = read.nextFloat();
		
		System.out.println("Your Night Additional: ");
		nightAdditional = read.nextFloat();

		System.out.println("Your Overtimes: ");
		overtime = read.nextFloat();
		
		System.out.println("Your Deductions: ");
		deduction = read.nextFloat();
		
		//Calculating
		liquidSalary = (grossSalary + nightAdditional + (overtime * 5)) - deduction;
		
		System.out.printf("Your Liquid Salary is %.2f", liquidSalary);
				
		
		read.close();

		
		

	}

}
