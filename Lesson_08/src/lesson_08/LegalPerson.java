package lesson_08;

import lesson_08.util.Text;

public class LegalPerson extends Client {

	private String cnpj;

	public LegalPerson(String firstName, String lastName, Address address, String cellPhone, String email, String cnpj) {
		super(firstName, lastName, address, cellPhone, email);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {

		return super.toString() + Text.padRight("CNPJ:", 15) + String.format("%s\n", this.cnpj);
	}

}
