package pharmacy.model;

public class Medicine extends Product {

	private String generic;
	
	public Medicine(int id, String name, int type, double price, String generic) {
		super(id, name, type, price);
		this.generic = generic;
	}

	public String getGeneric() {
		return generic;
	}

	public void setGeneric(String generic) {
		this.generic = generic;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("Generic: %s\n", this.getGeneric());
	}
}
