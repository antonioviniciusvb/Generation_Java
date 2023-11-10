package lesson_03;

import java.util.Scanner;

public class Exercise_04 {

	public static void main(String[] args) {

		String animal, userResponse;
		Scanner read = new Scanner(System.in);

		System.out.println("Type vertebrate or invertebrate");
		userResponse = read.nextLine().toLowerCase();

		// Vertebrate
		if (userResponse.equals("vertebrate")) {

			System.out.println("Enter bird or mammal");
			userResponse = read.nextLine().toLowerCase();

			// Bird
			if (userResponse.equals("bird")) {

				System.out.println("type carnivore or omnivore");
				userResponse = read.nextLine().toLowerCase();

				if (userResponse.equals("carnivore"))
					System.out.println("eagle");
				else
					System.out.println("Pigeon");

			} // mamal
			else {

				System.out.println("type omnivore or herbivorous");
				userResponse = read.nextLine().toLowerCase();

				if (userResponse.equals("omnivore"))
					System.out.println("Man");
				else
					System.out.println("Cow");

			}
		}
		// Animal invertebrate
		else {

			System.out.println("Enter insect or annelid");
			userResponse = read.nextLine().toLowerCase();

			// insect
			if (userResponse.equals("insect")) {

				System.out.println("type hematophagous or herbivorous");
				userResponse = read.nextLine().toLowerCase();

				if (userResponse.equals("hematophagous"))
					System.out.println("flea");
				else
					System.out.println("caterpillar");

			} // annelid
			else {

				System.out.println("type hematophagous or omnivore");
				userResponse = read.nextLine().toLowerCase();

				if (userResponse.equals("hematophagous"))
					System.out.println("leech");
				else
					System.out.println("worm");

			}
		}

		read.close();

	}

}
