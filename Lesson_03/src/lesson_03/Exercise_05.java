package lesson_03;

import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		char item;
		int count;
		float amount;

		showMenu();

		System.out.println("Choose one menu item to purchase");
		item = read.next().charAt(0);

		System.out.println("How many");
		count = read.nextInt();

		switch (item) {
		case '1':
			
			amount = 10 * count;	
			System.out.printf("Product: Hot dog\nAmount $ %.2f", amount);

			break;
		case '2':
			
			amount = 15 * count;
			System.out.printf("Product: X-Salad\nAmount $ %.2f", amount);
			break;
			
		case '3':
			amount = 18 * count;
			System.out.printf("Product: X-Bacon\nAmount $ %.2f", amount);
			break;
			
		case '4':
			amount = 12 * count;
			System.out.printf("Product: Toasted sandwich with cheese\nAmount $ %.2f", amount);
			break;
			
		case '5':
			amount = 8 * count;
			System.out.printf("Product: Soft Drink\nAmount $ %.2f", amount);
			break;
			
		case '6':
			amount = 13 * count;
			System.out.printf("Product: Orange juice\nAmount $ %.2f", amount);
			break;
		}

		read.close();

	}

	public static void showMenu() {

		System.out.println("---- Menu -----");
		System.out.println("1- Hot dog - $ 10.00");
		System.out.println("2- X-Salad - $ 15.00");
		System.out.println("3- X-Bacon - $ 18.00");
		System.out.println("4- Toasted sandwich with cheese - $ 12.00");
		System.out.println("5- Soft Drink - $ 8.00");
		System.out.println("6- Orange juice - $ 13.00");
		System.out.println();

	}

}
