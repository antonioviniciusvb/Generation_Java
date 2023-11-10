package lesson_04;
import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int number, resultMult;
		
		System.out.println("Choose a number to multiply");
		number = read.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			
			resultMult = i * number;
			System.out.printf("%d * %d = %d\n", number, i, resultMult);	
		}
		
		read.close();

	}

}
