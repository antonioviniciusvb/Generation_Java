package lesson_04;

import java.util.Scanner;

public class Research {

	public static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		
		int years, sport, countSoccer = 0, countVolleyball = 0;
		int countBasketBall = 0, countOthers = 0;
		String flag = "y";
		
		
		do {
	
			System.out.println("How old are you?");
			years = read.nextInt();
			
			showTable();
			
			sport = read.nextInt();
			
			if(sport == 1)
				countSoccer++;
			
			if(sport == 2 && years > 18)
				countVolleyball++;
			
			if(sport == 3 && years < 18)
				countBasketBall++;
			
			if(sport == 4)
				countOthers++;
	
		
		}while(sport > 0 && sport < 3);
		
		
		System.out.printf("Like Soccer: %d\n", countSoccer);
		System.out.printf("Like Volleyball and are over 18: %d\n", countVolleyball);
		System.out.printf("Like Basketball and are under 18: %d\n", countBasketBall);
		System.out.printf("Like Others Sports: %d\n", countOthers);
	}
	
	
	private static void showTable() {

		System.out.println("--- Sports ---");
		System.out.println("1- Soccer");
		System.out.println("2- Volleyball");
		System.out.println("3- Basketball");
		System.out.println("4- Others");
		System.out.println("What is your favorite sport ?");
		
	}

}
