package lesson_03;
import java.util.Scanner;

public class Exercise_01_If {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numberOne, numberTwo, numberThree, sum;
		
		System.out.println("Enter the value A");
		numberOne = read.nextInt();
		
		System.out.println("Enter the value B");
		numberTwo = read.nextInt();
		
		System.out.println("Enter the value C");
		numberThree = read.nextInt();
		
		sum = numberOne + numberTwo;
		
		if(sum > numberThree) 
			System.out.println("The Sum A+B is Greater than the C");
		else if(sum < numberThree)   
			System.out.println("The Sum A+B is Less than then C");
		else
			System.out.println("The Sum A+B is Equal than the C");
		
		
		read.close();

	}

}
