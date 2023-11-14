package lesson_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		
		HashSet<String> fruits = new HashSet<String>();
		
		fruits.add("avocado");
		fruits.add("banana");
		fruits.add("avocado");
		fruits.add("strawberry");
		fruits.add("jaboticaba");
		fruits.add("kiwi");
		
		System.out.println(fruits);

		for (var fruit : fruits) {
			System.out.println(fruit.hashCode());
		}
		
		System.out.println("Jaboticaba exists? " + fruits.contains("jaboticaba"));
		
		fruits.remove("banana");
		
		System.out.println(fruits);
		
		Iterator<String> iFruits = fruits.iterator();
		
		while(iFruits.hasNext()) {
			System.out.println(iFruits.next());
		}
		
		ArrayList fruitsList = new ArrayList<String>(fruits);
		
		System.out.println(fruitsList);
		
		fruitsList.sort(null);
		
		System.out.println(fruitsList);
		
		fruitsList.sort(Comparator.reverseOrder());
		
		System.out.println(fruitsList);
	}

}
