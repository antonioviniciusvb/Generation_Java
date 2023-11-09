package lesson_03;

import java.util.Scanner;

public class Exercise_08 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		float balance = 1000.00f, withdrawal, deposit;
		int operation = 0;

		showOperations();

		while (operation != 9) {

			System.out.printf("Balance: %.2f\n", balance);
			
			System.out.println("Choose an operation");
			operation = read.nextInt();

			if (operation == 1) {

				if (balance > 0) {

					System.out.println("withdrawal value?");
					withdrawal = read.nextFloat();

					if (balance >= withdrawal) {
						balance -= withdrawal;
						System.out.println("Withdrawals Sucess");
					}else {
						System.out.println("Insufficient funds");
					}

				} else {
					System.out.println("Insufficient funds");
				}

			} else if(operation == 2) {

				System.out.println("Deposit amount");
				deposit = read.nextFloat();
				balance += deposit;
			}

		}

		read.close();

	}

	public static void showOperations() {

		System.out.println("1- Withdrawal");
		System.out.println("2- Deposit");
		System.out.println("9- Exit");
		System.out.println();
	}

}
