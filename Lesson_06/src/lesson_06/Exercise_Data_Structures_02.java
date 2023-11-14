package lesson_06;

import java.util.Scanner;
import java.util.Stack;

public class Exercise_Data_Structures_02 {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		Stack<String> books = new Stack<String>();
		char option, continueRemove;
		boolean showOptions = true;

		while (showOptions) {

			showMenu();
			option = read.nextLine().charAt(0);

			switch (option) {
			case '1':
				System.out.println("Enter the Book Name");
				books.push(read.nextLine());
				System.out.println("Book added successfully");

				break;

			case '2':
				
				listStackBooks(books);

				break;

			case '3':

				if (books.isEmpty()) {
					System.out.println("stack is empty");
				} else {
					System.out.println("Are you sure you want to remove? y/n");
					continueRemove = read.nextLine().charAt(0);

					if (continueRemove == 'y') {

						System.out.printf("Book: %s successfully removed\n", books.peek());
						books.pop();

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
	
	public static void listStackBooks(Stack<String> books) {
		
		if (books.size() > 0) {
			System.out.println("--- Books ---");
			books.forEach((book) -> System.out.println(book));
		}

	}

	public static void showMenu() {

		System.out.println("********************************");
		System.out.println("1- Add book to stack");
		System.out.println("2- List all books");
		System.out.println("3- Remove Book from stack");
		System.out.println("0- Exit");
		System.out.println("********************************");
		System.out.println("Enter the desired option:");
	}

}
