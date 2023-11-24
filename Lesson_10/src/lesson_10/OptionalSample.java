package lesson_10;

import java.util.Optional;

public class OptionalSample {

	public static void main(String[] args) {
		String[] words = new String[10];
		
		words[5] = "Object Full";
		
		String word = "Object is null";
		Optional<String> checkNull = Optional.ofNullable(words[5]);

		if (checkNull.isPresent())
			word = checkNull.get();

		System.out.println(word);

	}

}
