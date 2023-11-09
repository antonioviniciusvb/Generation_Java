package lesson_03;

import java.util.Scanner;

public class Exercise_03 {

	public static void main(String[] args) {
		
		String name, able;
		char ageRange = 0;
		boolean isFirstTime;

		Scanner read = new Scanner(System.in);

		System.out.println("What is your name?");
		name = read.nextLine();

		showTableRange();

		System.out.println("Enter your age group code");
		ageRange = read.next().charAt(0);
		
		System.out.println("First time with a blood donor?");
		isFirstTime = read.nextBoolean();
		
		if(ageRange == '1' || ageRange == '2' && isFirstTime)
			able = "able";
		else
			able = "not able";
		
		System.out.printf("%s %s to donate blood", name, able);
	

		read.close();

	}
	
	public static void showTableRange() {

		System.out.println("Age range");
		System.out.println("1- 18 to 60 years old");
		System.out.println("2- 61 to 69 years old");
		System.out.println();

	}

}
