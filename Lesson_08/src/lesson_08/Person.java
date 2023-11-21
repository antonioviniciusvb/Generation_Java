package lesson_08;

import java.time.LocalDate;
import lesson_08.util.Converter;
import lesson_08.util.Text;

public class Person extends Client {

	private String cpf;
	private LocalDate dateOfBirth;
	
	public Person(String firstName, String lastName, Address address, String cellPhone, String email,
			LocalDate dateOfBirth, String cpf) {
		super(firstName, lastName, address, cellPhone, email);
		this.dateOfBirth = dateOfBirth;
		this.cpf = cpf;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {

		return super.toString() + this.dateOfBirth.format(Converter.formatter) + "\n"
				+ Text.padRight("CPF:", 15) + String.format("%s\n", this.cpf);
	}

}
