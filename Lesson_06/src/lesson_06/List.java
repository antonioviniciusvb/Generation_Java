package lesson_06;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		ArrayList<Double> numbers = new ArrayList<Double>();
		numbers.add(10.10d);
		numbers.add(30.50d);
		numbers.add(100.10d);
		numbers.add(999.10d);
		numbers.add(2d);
		numbers.add(999.10d);
		
		for (var number : numbers) {
			System.out.println(number);
		}
		
		System.out.println(numbers);
		
		System.out.printf("Position element 999.10: %d\n", numbers.indexOf(999.10d));
		
		System.out.printf("Position element 999.10: %d\n", numbers.lastIndexOf(999.10d));
		
		System.out.printf("Exists element 100.10: %b\n", numbers.contains(100.10d));
		
		System.out.printf("Element at 3: %b\n", numbers.get(3));
		
		System.out.printf("Remove Element at 5: %b\n", numbers.remove(5));

		System.out.println(numbers);

		numbers.forEach(System.out::println);
		
		numbers.forEach((n) -> System.out.println(n+1));
		
		numbers.clear();
		
		System.out.printf("List is Empty: %b", numbers.isEmpty());
		
	}

}
