package lesson_06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercise_Data_Structures_01 {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();
		char option, continueRemove;
		boolean showOptions = true;

		while (showOptions) {

			showMenu();
			option = read.nextLine().charAt(0);

			switch (option) {
			case '1':
				System.out.println("Enter the customer's name");
				queue.add(read.nextLine());
				System.out.println("Customer added successfully");

				break;

			case '2':

				if (queue.size() > 0) {
					System.out.println("--- Customer's ---");
					queue.forEach((customer) -> System.out.println(customer));
				}
				
				break;

			case '3':

				if (queue.isEmpty()) {
					System.out.println("Queue is empty");
				} else {
					System.out.println("Are you sure you want to remove? y/n");
					continueRemove = read.nextLine().charAt(0);

					if (continueRemove == 'y') {

						System.out.printf("Customer: %s successfully removed\n", queue.peek());
						queue.poll();

					} else {

						System.out.println("Operation canceled");
					}
				}

				break;

			case '0':
				showOptions = false;
				break;

			default:

				System.out.println("Invalid Input. Enter 1,2,3 or 4");
				break;
			}
		}

	}

	public static void showMenu() {

		System.out.println("********************************");
		System.out.println("1- Add customer to queue");
		System.out.println("2- List all customers");
		System.out.println("3- Remove customer from queue");
		System.out.println("0- Exit");
		System.out.println("********************************");
		System.out.println("Enter the desired option:");
	}

}
