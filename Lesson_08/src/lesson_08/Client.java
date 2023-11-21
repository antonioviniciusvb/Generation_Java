package lesson_08;


import lesson_08.util.Text;

public class Client {

	private static int quantityOfClients = 0;
	private int id;
	private String firstName;
	private String lastName;
	private Address address;
	private String cellPhone;
	private String email;

	public Client(String firstName, String lastName, Address address, String cellPhone, String email) {
		
		this.id = ++quantityOfClients;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = new Address(address.getStreet(), address.getNumber(), address.getComplement(),
				address.getNeighborhood(), address.getCity(),address.getState(), address.getCountry(),
				address.getUf(), address.getZipCode());
		this.cellPhone = cellPhone;
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {

		return this.id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {

		return Text.padRight("Id:", 15) + String.format("%d\n", this.id) + Text.padRight("First Name:", 15)
				+ String.format("%s\n", this.firstName) + Text.padRight("Last Name:", 15)
				+ String.format("%s\n", this.lastName) + Text.padRight("Date of Birth:", 15)
				+ String.format("%s\n", this.cellPhone) + Text.padRight("Email:", 15)
				+ String.format("%s\n", this.email);
	}

}
