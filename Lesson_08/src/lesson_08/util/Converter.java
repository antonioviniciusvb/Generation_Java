package lesson_08.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Converter {

	public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static LocalDate stringToLocalDate(String date) {

		return LocalDate.parse(date, formatter);
	}

}
