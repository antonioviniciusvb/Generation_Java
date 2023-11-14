package lesson_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_Collection_01 {

	public static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();
		int maxColor = 5;
		
		for (int i = 0; i < maxColor; i++) {
			
			System.out.printf("[%d] - Enter a color:\n", i+1);
			colors.add(read.nextLine());
			
		}

		System.out.println("ArrayList - Colors");
		colors.forEach((color) -> System.out.printf("%s\n", color));
		
		//Order Ascending
		colors.sort(null);
		
		System.out.println("ArrayList - Ordered");
	    colors.forEach((color) -> System.out.printf("%s\n", color));
		

	}

}
