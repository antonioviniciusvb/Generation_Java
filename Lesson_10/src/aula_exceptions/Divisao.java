package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		boolean loop = true;

		do {

			try {

				int dividendo = 0;
				int divisor = 0;

				System.out.println("Digite o Dividendo: ");
				dividendo = ler.nextInt();

				System.out.println("Digite o Divisor: ");
				divisor = ler.nextInt();

				divide(dividendo, divisor);

				loop = false;

			} catch (InputMismatchException e) {

				System.err.println("A operação aceita apenas números" + e);

			} catch (ArithmeticException e) {
				System.err.println("Um número não pode ser divisivel por zero" + e);
			} finally {

				ler.nextLine();
			}

		} while (loop);
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
