package pharmacy.model;

public class Cosmetic extends Product{
	
	private String fragrance;
	
	public Cosmetic(int id, String name, int type, double price, String fragrance) {
		super(id, name, type, price);
		this.fragrance = fragrance;
	}

	public String getFragrance() {
		return fragrance;
	}

	public void setFragrance(String fragrance) {
		this.fragrance = fragrance;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("Fragrance: %s\n", this.getFragrance());
	}

}
