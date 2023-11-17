package lesson_08;

import java.util.ArrayList;

import lesson_08.util.Converter;

public class TestCient {

	public static void main(String[] args) {

		// Create objects
		Client antonio = new Client("Antonio", "Bandeira", Converter.stringToLocalDate("11/02/1970"), "99 91234-5678",
				"antonio.email@gmail.com");

		Client carla = new Client("Carla", "Antunes", Converter.stringToLocalDate("14/11/2005"), "22 98756-4321",
				"carla.email@gmail.com");

		Client jessica = new Client("Jessica", "Lobato", Converter.stringToLocalDate("30/05/2023"), "74 14785-7536",
				"jessica.email@gmail.com");

		Client leonardo = new Client("Leonardo", "Silva", Converter.stringToLocalDate("01/09/1980"), "11 16666-4444",
				"leonardo.email@gmail.com");

		// Show Informations
		System.out.println(antonio);
		System.out.println(carla);
		System.out.println(jessica);
		System.out.println(leonardo);

		System.out.println("Antonio, id: " + antonio.getId());
		System.out.println("Carla, id: " + carla.getId());

		System.out.println("Antonio, cellPhone: " + antonio.getCellPhone());
		System.out.println("Carla, cellPhone: " + carla.getCellPhone());

		System.out.println("Leornardo, email: " + leonardo.getEmail());
		System.out.println("Jessica, email: " + jessica.getEmail());
		
		// Set new data
		antonio.setDateOfBirth(Converter.stringToLocalDate("14/07/1900"));
		antonio.setEmail("email.home@email.com");

		jessica.setFirstName("Jéssica");
		jessica.setLastName("Aparecida");

		leonardo.setCellPhone("1154-1203");

		carla.setEmail("carla.office@dev.com");

		// Using ArrayList
		ArrayList<Client> clients = new ArrayList<Client>();

		clients.add(antonio);
		clients.add(jessica);
		clients.add(carla);
		clients.add(leonardo);

		clients.forEach(client -> System.out.println(client));
		
		
		System.out.printf("Total Client: %d", clients.size());

	}

}
