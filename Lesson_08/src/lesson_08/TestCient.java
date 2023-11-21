package lesson_08;

import java.util.ArrayList;

import lesson_08.util.Converter;

public class TestCient {

	public static void main(String[] args) {

		Address address = new Address("Rua Oliveira", 200, "Casa 02", "Ipiranga", "São Paulo",
				"São Paulo", "Brasil", "SP", "98541-120");
		
		Client antonio = new Client("Antonio", "Bandeira", address, "99 91234-5678", "antonio.email@gmail.com");
		
		Person carla = new Person("Carla", "Alves", address, "99 90000-4152", "carla.email@gmail.com",
				Converter.stringToLocalDate("21/11/2000"), "999.444.520-47");
		
		LegalPerson leonardo = new LegalPerson("Leonardo", "Santos", address, "91 11111-4556", 
				"leonardo.email@gmail.com", "100.142.451/0001");
		
		Client jessica = new Client("Jessica", "Ribeiro", address, "99 9453-3333", "jessica.email@gmail.com");


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
//		antonio.setDateOfBirth(Converter.stringToLocalDate("14/07/1900"));
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
