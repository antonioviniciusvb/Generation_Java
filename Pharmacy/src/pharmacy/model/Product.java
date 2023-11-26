package pharmacy.model;

public abstract class Product {

	private int id;
	private String name;
	private int type;
	private double price;

	public Product(int id, String name, int type, double price) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}
	
	public String getDescriptionType() {
		return type == 1 ? "Medicine": "Cosmetic";
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {

		return String.format("Id: %d\n", this.getId()) + String.format("Name: %s\n", this.getName())
				+ String.format("Price: %.2f\n", this.getPrice()) + String.format("Type: %s\n", this.getDescriptionType());
	}
}
