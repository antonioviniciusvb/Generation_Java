package lesson_04;
import java.util.Scanner;

public class Exercise_04 {

	public static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int age, gender, specialist = 0, statisticsOne = 0;
		int statisticsTwo = 0, statisticsThree = 0, statisticsFor = 0;
		int totalPeople = 0, sumAge = 0;
		double averageAge = 0d;
		String flag = "y";
		
		while(flag.equalsIgnoreCase("y")) {
			
			System.out.println("How old are you?");
			age = read.nextInt();	
			
			showTableGender();
			
			System.out.println("What is your gender identity?");
			gender = read.nextInt();
			
			showTableSpecialist();
			
			System.out.println("What is your specialization?");
			specialist = read.nextInt();
			
			// Backend
			if(specialist == 1) {
				statisticsOne++;
			}
			//Woman,Cis,Trans,FrontEnd
			else if((gender == 1 || gender == 4) && specialist == 2) {
				statisticsTwo++;
			}
			//Man,Cis,Trans,Mobile,Over 40 years old
			else if((gender == 2 || gender == 5) && 
					(specialist == 3 && age > 40)) {
				statisticsThree++;
			}
			//Nonbinary,FullStack,Under 30 years old
			else if(gender == 3 && specialist == 4 && age < 30) {
				statisticsFor++;
			}
			
			//Total people
			totalPeople++;
			
			//Sum Age
			sumAge += age; 

			//Option exit
			System.out.println("Do you want to add another collaborator (y/n)?");
			read.skip("\\R");
			flag = read.nextLine();
		}
		
		//Average Age
		averageAge = (double) sumAge / totalPeople;
		
		
		System.out.println("*** Statistics ***");
		System.out.printf("Dev's Backend: %d\n", statisticsOne);
		System.out.printf("Woman,Cis,Trans,FrontEnd: %d\n", statisticsTwo);
		System.out.printf("Man,Cis,Trans,Mobile,Over 40 years old: %d\n", statisticsThree);
		System.out.printf("Nonbinary,FullStack,Under 30 years old: %d\n", statisticsFor);
		System.out.printf("Total People: %d\n", totalPeople);
		System.out.printf("Average Age: %.2f", averageAge);
		
		

	}

	private static void showTableSpecialist() {
		
		System.out.println("1- Backend");
		System.out.println("2- Frontend");
		System.out.println("3- Mobile");
		System.out.println("4- FullStack");
	}

	private static void showTableGender() {
		System.out.println("1- Woman Cis");
		System.out.println("2- Man Cis");
		System.out.println("3- Nonbinary");
		System.out.println("4- Woman Trans");
		System.out.println("5- Man Trans");
		System.out.println("6- Others");
	}

}
